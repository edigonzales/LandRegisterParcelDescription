
package ch.admin.geo.schemas.bj.tgbv.gbbasistypen._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BBArt.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BBArt"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="Gebaeude"/&gt;
 *     &lt;enumeration value="befestigt.Strasse_Weg"/&gt;
 *     &lt;enumeration value="befestigt.Trottoir"/&gt;
 *     &lt;enumeration value="befestigt.Verkehrsinsel"/&gt;
 *     &lt;enumeration value="befestigt.Bahn"/&gt;
 *     &lt;enumeration value="befestigt.Flugplatz"/&gt;
 *     &lt;enumeration value="befestigt.Wasserbecken"/&gt;
 *     &lt;enumeration value="befestigt.uebrige_befestigte"/&gt;
 *     &lt;enumeration value="humusiert.Acker_Wiese_Weide"/&gt;
 *     &lt;enumeration value="humusiert.Intensivkultur.Reben"/&gt;
 *     &lt;enumeration value="humusiert.Intensivkultur.uebrige_Intensivkultur"/&gt;
 *     &lt;enumeration value="humusiert.Gartenanlage"/&gt;
 *     &lt;enumeration value="humusiert.Hoch_Flachmoor"/&gt;
 *     &lt;enumeration value="humusiert.uebrige_humusierte"/&gt;
 *     &lt;enumeration value="Gewaesser.stehendes"/&gt;
 *     &lt;enumeration value="Gewaesser.fliessendes"/&gt;
 *     &lt;enumeration value="Gewaesser.Schilfguertel"/&gt;
 *     &lt;enumeration value="bestockt.geschlossener_Wald"/&gt;
 *     &lt;enumeration value="bestockt.Wytweide.Wytweide_dicht"/&gt;
 *     &lt;enumeration value="bestockt.Wytweide.Wytweide_offen"/&gt;
 *     &lt;enumeration value="bestockt.uebrige_bestockte"/&gt;
 *     &lt;enumeration value="vegetationslos.Fels"/&gt;
 *     &lt;enumeration value="vegetationslos.Gletscher_Firn"/&gt;
 *     &lt;enumeration value="vegetationslos.Geroell_Sand"/&gt;
 *     &lt;enumeration value="vegetationslos.Abbau_Deponie"/&gt;
 *     &lt;enumeration value="vegetationslos.uebrige_vegetationslose"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BBArt")
@XmlEnum
public enum BBArt {

    @XmlEnumValue("Gebaeude")
    GEBAEUDE("Gebaeude"),
    @XmlEnumValue("befestigt.Strasse_Weg")
    BEFESTIGT_STRASSE_WEG("befestigt.Strasse_Weg"),
    @XmlEnumValue("befestigt.Trottoir")
    BEFESTIGT_TROTTOIR("befestigt.Trottoir"),
    @XmlEnumValue("befestigt.Verkehrsinsel")
    BEFESTIGT_VERKEHRSINSEL("befestigt.Verkehrsinsel"),
    @XmlEnumValue("befestigt.Bahn")
    BEFESTIGT_BAHN("befestigt.Bahn"),
    @XmlEnumValue("befestigt.Flugplatz")
    BEFESTIGT_FLUGPLATZ("befestigt.Flugplatz"),
    @XmlEnumValue("befestigt.Wasserbecken")
    BEFESTIGT_WASSERBECKEN("befestigt.Wasserbecken"),
    @XmlEnumValue("befestigt.uebrige_befestigte")
    BEFESTIGT_UEBRIGE_BEFESTIGTE("befestigt.uebrige_befestigte"),
    @XmlEnumValue("humusiert.Acker_Wiese_Weide")
    HUMUSIERT_ACKER_WIESE_WEIDE("humusiert.Acker_Wiese_Weide"),
    @XmlEnumValue("humusiert.Intensivkultur.Reben")
    HUMUSIERT_INTENSIVKULTUR_REBEN("humusiert.Intensivkultur.Reben"),
    @XmlEnumValue("humusiert.Intensivkultur.uebrige_Intensivkultur")
    HUMUSIERT_INTENSIVKULTUR_UEBRIGE_INTENSIVKULTUR("humusiert.Intensivkultur.uebrige_Intensivkultur"),
    @XmlEnumValue("humusiert.Gartenanlage")
    HUMUSIERT_GARTENANLAGE("humusiert.Gartenanlage"),
    @XmlEnumValue("humusiert.Hoch_Flachmoor")
    HUMUSIERT_HOCH_FLACHMOOR("humusiert.Hoch_Flachmoor"),
    @XmlEnumValue("humusiert.uebrige_humusierte")
    HUMUSIERT_UEBRIGE_HUMUSIERTE("humusiert.uebrige_humusierte"),
    @XmlEnumValue("Gewaesser.stehendes")
    GEWAESSER_STEHENDES("Gewaesser.stehendes"),
    @XmlEnumValue("Gewaesser.fliessendes")
    GEWAESSER_FLIESSENDES("Gewaesser.fliessendes"),
    @XmlEnumValue("Gewaesser.Schilfguertel")
    GEWAESSER_SCHILFGUERTEL("Gewaesser.Schilfguertel"),
    @XmlEnumValue("bestockt.geschlossener_Wald")
    BESTOCKT_GESCHLOSSENER_WALD("bestockt.geschlossener_Wald"),
    @XmlEnumValue("bestockt.Wytweide.Wytweide_dicht")
    BESTOCKT_WYTWEIDE_WYTWEIDE_DICHT("bestockt.Wytweide.Wytweide_dicht"),
    @XmlEnumValue("bestockt.Wytweide.Wytweide_offen")
    BESTOCKT_WYTWEIDE_WYTWEIDE_OFFEN("bestockt.Wytweide.Wytweide_offen"),
    @XmlEnumValue("bestockt.uebrige_bestockte")
    BESTOCKT_UEBRIGE_BESTOCKTE("bestockt.uebrige_bestockte"),
    @XmlEnumValue("vegetationslos.Fels")
    VEGETATIONSLOS_FELS("vegetationslos.Fels"),
    @XmlEnumValue("vegetationslos.Gletscher_Firn")
    VEGETATIONSLOS_GLETSCHER_FIRN("vegetationslos.Gletscher_Firn"),
    @XmlEnumValue("vegetationslos.Geroell_Sand")
    VEGETATIONSLOS_GEROELL_SAND("vegetationslos.Geroell_Sand"),
    @XmlEnumValue("vegetationslos.Abbau_Deponie")
    VEGETATIONSLOS_ABBAU_DEPONIE("vegetationslos.Abbau_Deponie"),
    @XmlEnumValue("vegetationslos.uebrige_vegetationslose")
    VEGETATIONSLOS_UEBRIGE_VEGETATIONSLOSE("vegetationslos.uebrige_vegetationslose");
    private final String value;

    BBArt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BBArt fromValue(String v) {
        for (BBArt c: BBArt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
