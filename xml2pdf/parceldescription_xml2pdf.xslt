<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:extract="http://geo.so.ch/schema/AGI/LandRegisterParcelDescription/1.0/Extract" exclude-result-prefixes="extract" version="1.0">
  <xsl:output method="xml" indent="yes"/>
  <xsl:decimal-format name="swiss" decimal-separator="." grouping-separator="'"/>
  <xsl:template match="extract:GetExtractByIdResponse">
    <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xsd="https://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
      <fo:layout-master-set>
        <fo:simple-page-master master-name="firstPage" page-height="297mm" page-width="210mm" margin-top="10mm" margin-bottom="10mm" margin-left="12mm" margin-right="10mm">
          <fo:region-body margin-top="45mm" background-color="#FFFFAA"/>
          <fo:region-before extent="40mm" background-color="#AAFFFF"/>
          <fo:region-after extent="10mm" background-color="#FFAAFF" display-align="after"/>
        </fo:simple-page-master>
        <fo:simple-page-master master-name="middlePage" page-height="297mm" page-width="210mm" margin-top="10mm" margin-bottom="10mm" margin-left="12mm" margin-right="10mm">
          <fo:region-body margin-top="15mm" background-color="#FFFFAA"/>
          <fo:region-before extent="10mm" background-color="#AAFFFF"/>
          <fo:region-after extent="10mm" background-color="#FFAAFF" display-align="after"/>
        </fo:simple-page-master>
        <fo:page-sequence-master master-name="allPages">
          <fo:repeatable-page-master-alternatives>
            <fo:conditional-page-master-reference page-position="first" master-reference="firstPage"/>
            <fo:conditional-page-master-reference page-position="rest" master-reference="middlePage"/>
          </fo:repeatable-page-master-alternatives>
        </fo:page-sequence-master>
      </fo:layout-master-set>
      <xsl:apply-templates/>
    </fo:root>
  </xsl:template>
  <xsl:template match="extract:Extract">
    <fo:page-sequence master-reference="allPages" id="my-sequence-id">
      <fo:static-content flow-name="xsl-region-before">
        <fo:block>
          <fo:block-container absolute-position="absolute" top="0mm" left="123mm" background-color="#FFFFFF">
            <fo:block>
              <fo:external-graphic height="6.7mm" width="60mm" content-width="scale-to-fit" content-height="scale-to-fit">
                <xsl:attribute name="src">
                  <xsl:text>url('data:</xsl:text>
                  <xsl:text>image/png;base64,</xsl:text>
                  <xsl:value-of select="extract:CantonalLogo"/>
                  <xsl:text>')</xsl:text>
                </xsl:attribute>
              </fo:external-graphic>
            </fo:block>
          </fo:block-container>
        </fo:block>
        <fo:retrieve-marker retrieve-class-name="subHeader" retrieve-position="first-starting-within-page"/>
      </fo:static-content>
      <fo:static-content flow-name="xsl-region-after">
        <fo:table table-layout="fixed" width="100%" margin-top="4mm" font-size="7pt" font-style="italic" font-weight="400" font-family="Frutiger">
          <fo:table-column column-width="50%"/>
          <fo:table-column column-width="50%"/>
          <fo:table-body>
            <fo:table-row>
              <fo:table-cell>
                <fo:block>
                  <xsl:value-of select="format-dateTime(extract:CreationDate,'[Y0001]-[M01]-[D01] [H01]:[m01]:[s01]')"/>
                </fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right">
                <fo:block>Seite <fo:page-number/>/<fo:page-number-citation-last ref-id="my-sequence-id"/></fo:block>
              </fo:table-cell>
            </fo:table-row>
          </fo:table-body>
        </fo:table>
      </fo:static-content>
      <xsl:apply-templates select="extract:RealEstate"/>
    </fo:page-sequence>
  </xsl:template>
  <xsl:template match="extract:RealEstate">
    <fo:flow flow-name="xsl-region-body">
      <fo:block>
        <!-- sub header for the first page -->
        <fo:marker marker-class-name="subHeader">
          <fo:block-container absolute-position="absolute" top="6.7mm" left="0mm" line-height="1em" background-color="#FFFFFF">
            <fo:block font-size="10pt" font-style="italic" font-weight="700" font-family="Frutiger">
              <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:Name"/>
            </fo:block>
            <fo:block font-size="10pt" font-style="italic" font-weight="400" font-family="Frutiger" margin-left="6mm" margin-top="1mm">
              <fo:block>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:PostalAddress/extract:Street"/>
                <xsl:text> </xsl:text>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:PostalAddress/extract:Number"/>
              </fo:block>
              <fo:block>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:PostalAddress/extract:PostalCode"/>
                <xsl:text> </xsl:text>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:PostalAddress/extract:City"/>
              </fo:block>
              <fo:block>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:PostalAddress/extract:Phone"/>
              </fo:block>
              <fo:block>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:PostalAddress/extract:Email"/>
              </fo:block>
              <fo:block>
                <xsl:value-of select="/extract:GetExtractByIdResponse/extract:Extract/extract:ResponsibleOffice/extract:OfficeAtWeb"/>
              </fo:block>
            </fo:block>
          </fo:block-container>
        </fo:marker>
      </fo:block>
      <fo:block>
        <!-- sub header for the not-first pages -->
        <fo:marker marker-class-name="subHeader">
          <fo:block></fo:block>
        </fo:marker>
      </fo:block>
      <fo:block-container wrap-option="wrap" hyphenate="false" hyphenation-character="-" font-weight="700" font-size="14pt" font-family="Frutiger">
        <fo:table table-layout="fixed" width="100%">
          <fo:table-column column-width="94mm"/>
          <fo:table-column column-width="94mm"/>
          <fo:table-body>
            <fo:table-row>
              <fo:table-cell>
                <fo:block>Grundstücksbeschrieb</fo:block>
              </fo:table-cell>
              <fo:table-cell>
                <fo:block>GB-Nr. <xsl:value-of select="extract:Number"/></fo:block>
              </fo:table-cell>
            </fo:table-row>
          </fo:table-body>
        </fo:table>
      </fo:block-container>
      <fo:block-container wrap-option="wrap" hyphenate="false" hyphenation-character="-" font-weight="400" font-size="10pt" font-family="Frutiger">
        <fo:table table-layout="fixed" width="100%" margin-top="8mm">
          <fo:table-column column-width="50mm"/>
          <fo:table-column column-width="25mm"/>
          <fo:table-column column-width="19mm"/>
          <fo:table-column column-width="50mm"/>
          <fo:table-column column-width="25mm"/>
          <fo:table-body>
            <fo:table-row>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Gemeinde:</fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block>
                  <xsl:value-of select="extract:Municipality"/>
                </fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block/>
              </fo:table-cell>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>EGRID:</fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block>
                  <xsl:value-of select="extract:EGRID"/>
                </fo:block>
              </fo:table-cell>
            </fo:table-row>
            <fo:table-row>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Grundbuch:</fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block>
                  <xsl:value-of select="extract:SubunitOfLandRegister"/>
                </fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block/>
              </fo:table-cell>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>NBIdent:</fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block>
                  <xsl:value-of select="extract:IdentND"/>
                </fo:block>
              </fo:table-cell>
            </fo:table-row>
            <fo:table-row>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Grundstücksart:</fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block>
                  <xsl:value-of select="extract:Type"/>
                </fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block/>
              </fo:table-cell>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Grundstücksfläche:</fo:block>
              </fo:table-cell>
              <fo:table-cell text-align="right" padding-top="2mm">
                <fo:block line-height-shift-adjustment="disregard-shifts"><xsl:value-of select="format-number(extract:LandRegistryArea, &quot;#'###&quot;, &quot;swiss&quot;)"/> m<fo:inline baseline-shift="super" font-size="60%">2</fo:inline></fo:block>
              </fo:table-cell>
            </fo:table-row>
          </fo:table-body>
        </fo:table>
      </fo:block-container>

      <fo:block-container wrap-option="wrap" hyphenate="false" hyphenation-character="-" font-weight="400" font-size="10pt" font-family="Frutiger" background-color="gold">
        <fo:table table-layout="fixed" width="100%" margin-top="8mm">
          <fo:table-column column-width="188mm"/>
          <fo:table-body>
            <fo:table-row>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Eigentümer:</fo:block>
              </fo:table-cell>
            </fo:table-row>
            <fo:table-row>
              <fo:table-cell font-weight="400" padding-top="1mm">
                <fo:block>Lisa Liegenschaft, Hauptgasse 54, 9999 Entenhausen
                </fo:block>
              </fo:table-cell>
            </fo:table-row>
            <fo:table-row>
              <fo:table-cell font-weight="400" padding-top="1mm">
                <fo:block>Hans Grundstück, Foobarstrasse 12, 1111 St. Erpelsburg
                </fo:block>
              </fo:table-cell>
            </fo:table-row>
          </fo:table-body>
        </fo:table>
      </fo:block-container>

      <fo:block-container wrap-option="wrap" hyphenate="false" hyphenation-character="-" font-weight="400" font-size="10pt" font-family="Frutiger">
        <fo:table table-layout="fixed" width="100%" margin-top="8mm">
          <fo:table-column column-width="94mm"/>
          <fo:table-column column-width="94mm"/>
          <fo:table-body>
            <fo:table-row>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Bodenbedeckung:</fo:block>
              </fo:table-cell>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Flurnamen:</fo:block>
              </fo:table-cell>
            </fo:table-row>
            <fo:table-row>
              <fo:table-cell font-weight="400" padding-top="1mm">
                <fo:block>
                  <fo:table table-layout="fixed" width="100%" margin-top="0mm">
                    <fo:table-column column-width="50mm"/>
                    <fo:table-column column-width="20mm"/>
                    <fo:table-column column-width="5mm"/>
                    <fo:table-body border-width="0pt" border-style="solid">
                      <xsl:for-each select="extract:LandCoverShare">
                        <xsl:sort select="extract:Type"/>
                        <fo:table-row border-width="0pt" border-style="solid">
                          <fo:table-cell padding-top="1mm" border-style="solid" border-width="0pt">
                            <fo:block>
                              <xsl:value-of select="extract:Type"/>
                            </fo:block>
                          </fo:table-cell>
                          <fo:table-cell padding-top="1mm" border-style="solid" border-width="0pt">
                            <fo:block text-align="right">
                              <xsl:value-of select="format-number(extract:Area, &quot;#'###&quot;, &quot;swiss&quot;)"/>
                            </fo:block>
                          </fo:table-cell>
                          <fo:table-cell padding-top="1mm" border-style="solid" border-width="0pt">
                            <fo:block text-align="right" margin-left="1mm" line-height-shift-adjustment="disregard-shifts">m<fo:inline baseline-shift="super" font-size="60%">2</fo:inline></fo:block>
                          </fo:table-cell>
                        </fo:table-row>
                      </xsl:for-each>
                      <fo:table-row border-width="0pt" border-style="solid" font-weight="400" font-style="italic">
                        <fo:table-cell padding-top="1mm">
                          <fo:block>Total</fo:block>
                        </fo:table-cell>
                        <fo:table-cell padding-top="1mm">
                          <fo:block text-align="right">
                            <xsl:value-of select="format-number(sum(extract:LandCoverShare/extract:Area), &quot;#'###&quot;, &quot;swiss&quot;)"/>
                          </fo:block>
                        </fo:table-cell>
                        <fo:table-cell padding-top="1mm">
                          <fo:block text-align="right" margin-left="1mm" line-height-shift-adjustment="disregard-shifts">m<fo:inline baseline-shift="super" font-size="60%">2</fo:inline></fo:block>
                        </fo:table-cell>
                      </fo:table-row>
                    </fo:table-body>
                  </fo:table>
                </fo:block>
              </fo:table-cell>
              <fo:table-cell font-weight="400" padding-top="2mm">
                <fo:block>
                  <xsl:value-of select="extract:LocalNames"/>
                </fo:block>
              </fo:table-cell>
            </fo:table-row>
          </fo:table-body>
        </fo:table>
      </fo:block-container>
      <fo:block-container wrap-option="wrap" hyphenate="false" hyphenation-character="-" font-weight="400" font-size="10pt" font-family="Frutiger">
        <fo:table table-layout="fixed" width="100%" margin-top="8mm">
          <fo:table-column column-width="94mm"/>
          <fo:table-column column-width="94mm"/>
          <fo:table-body>
            <fo:table-row>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Grundbuchamt:</fo:block>
              </fo:table-cell>
              <fo:table-cell font-weight="700" padding-top="2mm">
                <fo:block>Nachführungsgeometer:</fo:block>
              </fo:table-cell>
            </fo:table-row>
            <fo:table-row>
              <fo:table-cell font-weight="400" padding-top="2mm">
                <fo:block linefeed-treatment="preserve">
                  <xsl:value-of select="extract:LandRegisterOffice/extract:Name"/>
                  <xsl:text>
                  </xsl:text>
                  <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:Line1"/>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:Street"/>
                  <xsl:text> </xsl:text>
                  <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:Number"/>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:PostalCode"/>
                  <xsl:text> </xsl:text>
                  <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:City"/>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:text>Telefon </xsl:text>
                  <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:Phone"/>
                  <xsl:text> 
                  </xsl:text>
                  <fo:basic-link text-decoration="none" color="rgb(76,143,186)">
                    <xsl:attribute name="external-destination">mailto:<xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:Email"/></xsl:attribute>
                    <xsl:value-of select="extract:LandRegisterOffice/extract:PostalAddress/extract:Email"/>
                  </fo:basic-link>
                  <xsl:text> 
                  </xsl:text>
                  <fo:basic-link text-decoration="none" color="rgb(76,143,186)">
                    <xsl:attribute name="external-destination">http://<xsl:value-of select="extract:LandRegisterOffice/extract:OfficeAtWeb"/></xsl:attribute>
                    <xsl:value-of select="extract:LandRegisterOffice/extract:OfficeAtWeb"/>
                  </fo:basic-link>
                </fo:block>
              </fo:table-cell>
              <fo:table-cell font-weight="400" padding-top="2mm">
                <fo:block linefeed-treatment="preserve">
                  <xsl:value-of select="extract:SurveyorOffice/extract:Name"/>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Line1"/>
                  <xsl:if test="extract:SurveyorOffice/extract:PostalAddress/extract:Line2">
                    <xsl:text> 
                    </xsl:text>
                    <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Line2"/>
                  </xsl:if>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Street"/>
                  <xsl:text> </xsl:text>
                  <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Number"/>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:PostalCode"/>
                  <xsl:text> </xsl:text>
                  <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:City"/>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:text> 
                  </xsl:text>
                  <xsl:text>Telefon </xsl:text>
                  <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Phone"/>
                  <xsl:text> 
                  </xsl:text>
                  <fo:basic-link text-decoration="none" color="rgb(76,143,186)">
                    <xsl:attribute name="external-destination">mailto:<xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Email"/></xsl:attribute>
                    <xsl:value-of select="extract:SurveyorOffice/extract:PostalAddress/extract:Email"/>
                  </fo:basic-link>
                  <xsl:text> 
                  </xsl:text>
                  <fo:basic-link text-decoration="none" color="rgb(76,143,186)">
                    <xsl:attribute name="external-destination">http://<xsl:value-of select="extract:SurveyorOffice/extract:OfficeAtWeb"/></xsl:attribute>
                    <xsl:value-of select="extract:SurveyorOffice/extract:OfficeAtWeb"/>
                  </fo:basic-link>
                </fo:block>
              </fo:table-cell>
            </fo:table-row>
          </fo:table-body>
        </fo:table>
      </fo:block-container>
      <fo:block-container page-break-before="always" margin="0mm" padding="0mm" space-before="0mm">
        <fo:block font-size="0pt" padding="0mm" margin="0mm" line-height="0mm" space-before="0mm">
          <fo:external-graphic height="250mm" width="188mm" content-height="scale-to-fit" margin="0mm" padding="0mm" space-before="0mm" border="0.5pt solid black">
            <xsl:attribute name="src">
              <xsl:text>url('data:</xsl:text>
              <xsl:text>image/png;base64,</xsl:text>
              <xsl:value-of select="extract:Map"/>
              <xsl:text>')</xsl:text>
            </xsl:attribute>
          </fo:external-graphic>
        </fo:block>
      </fo:block-container>
    </fo:flow>
  </xsl:template>
</xsl:stylesheet>
