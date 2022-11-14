package org.example.syntheakds.processing.openehr.generated.kdspersoncomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvCodedText;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.address.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-11-02T11:32:18.039207200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.23.0-SNAPSHOT"
)
public class PostfachCluster implements LocatableEntity {
  /**
   * Path: Person/Personendaten/Person/Postfach/Postfach
   * Description: Eine unstrukturierte Adresszeile, die alle relevanten Details auf Straßenebene oder zum Postfach darstellt, die die Identifizierung eines Standorts unterstützen würden.
   * Comment: Vorkommen für dieses Datenelement ist auf 0..* gesetzt, damit ein oder mehrere Freitext-„Adresszeilen“-Datenelemente die große Vielfalt an Möglichkeiten darstellen können, wie Details auf „Straßenebene“ möglicherweise im Kontext einer bestimmten "Stadt" erfasst werden müssen. Mehrere Adresszeilen können in einem Template dargestellt und in „Adresszeile 1“, „Adresszeile 2“ usw. umbenannt werden. Beispiel: „7A/52 Davis Street“ oder „Appartment 7A“ als Adresszeile 1 mit „52 Davis Street“ als Adresszeile 2; ein Postfachstandort am Straßenrand, wie z. B. „RMB 725, Princes Highway“ oder Verwendung eines beschreibenden Orientierungspunkts wie „Ecke Smith & Brown Street“ oder „Zweites Haus nördlich des Gemischtwarenladens mit der roten Tür“.
   */
  @Path("/items[at0001 and name/value='Postfach']")
  private List<PostfachPostfachElement> postfach;

  /**
   * Path: Person/Personendaten/Person/Postfach/Stadtteil
   * Description: Der Name des Vorortes, der Stadt, des Dorfes, der Gemeinde oder des Ortes der untersten Ebene der Adresse.
   * Comment: Die Codierung mit einer externen Terminologie wird nach Möglichkeit bevorzugt. Zum Beispiel: Fitzroy, Manchester, Kingston oder Bergen.
   */
  @Path("/items[at0002 and name/value='Stadtteil']/value|value")
  private String stadtteilValue;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Stadtteil/null_flavour
   */
  @Path("/items[at0002 and name/value='Stadtteil']/null_flavour|defining_code")
  private NullFlavour stadtteilNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Stadt
   * Description: Der Name des Vorortes, der Stadt, des Dorfes, der Gemeinde oder des Ortes der untersten Ebene der Adresse.
   * Comment: Die Codierung mit einer externen Terminologie wird nach Möglichkeit bevorzugt. Zum Beispiel: Fitzroy, Manchester, Kingston oder Bergen.
   */
  @Path("/items[at0002 and name/value='Stadt']/value|value")
  private String stadtValue;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Stadt/null_flavour
   */
  @Path("/items[at0002 and name/value='Stadt']/null_flavour|defining_code")
  private NullFlavour stadtNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Gemeindeschlüssel
   * Description: Der Name des Vorortes, der Stadt, des Dorfes, der Gemeinde oder des Ortes der untersten Ebene der Adresse.
   * Comment: Die Codierung mit einer externen Terminologie wird nach Möglichkeit bevorzugt. Zum Beispiel: Fitzroy, Manchester, Kingston oder Bergen.
   */
  @Path("/items[at0002 and name/value='Gemeindeschl\u00fcssel']/value|value")
  private String gemeindeschluesselValue;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Gemeindeschlüssel/null_flavour
   */
  @Path("/items[at0002 and name/value='Gemeindeschl\u00fcssel']/null_flavour|defining_code")
  private NullFlavour gemeindeschluesselNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Bundesland
   * Description: Der Name eines großen politischen Bezirks oder geografischen Gebiets, der/das die Adresse enthält.
   * Comment: Die Codierung mit einer externen Terminologie wird nach Möglichkeit bevorzugt. Zum Beispiel: „New South Wales“ und „Queensland“ in Australien, „British Columbia“ und „Nova Scotia“ in Kanada und die Pfarreien von 'St. Andrew“ und „Kingston“ in Jamaika.
   */
  @Path("/items[at0004 and name/value='Bundesland']/value")
  private DvCodedText bundesland;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Bundesland/null_flavour
   */
  @Path("/items[at0004 and name/value='Bundesland']/null_flavour|defining_code")
  private NullFlavour bundeslandNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Postleitzahl
   * Description: Der Code für einen Postzustellungsbereich, der die Adresse enthält, wie vom jeweiligen Postzustelldienst definiert.
   * Comment: Auch als Postleitzahl PLZ bekannt.
   */
  @Path("/items[at0005]/value|value")
  private String postleitzahlValue;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Postleitzahl/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour postleitzahlNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Land
   * Description: Der Name des Landes, in dem sich die Adresse befindet.
   * Comment: Zum Beispiel: Australien, Kanada, Jamaika oder Norwegen. Die Codierung mit einer externen Terminologie, wie z. B. EN ISO 3166–1 Alpha 2 Ländercode, wird empfohlen.
   */
  @Path("/items[at0006]/value")
  private DvCodedText land;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Land/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour landNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Art
   * Description: Art der Adresse.
   * Comment: Zum Beispiel: Hausadresse oder postalische Adresse.
   */
  @Path("/items[at0010]/value|defining_code")
  private ArtDefiningCode artDefiningCode;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Art/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour artNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Verwendung
   * Description: Der primäre Zweck oder die primäre Verwendung der Adresse.
   */
  @Path("/items[at0014]/value|defining_code")
  private VerwendungDefiningCode verwendungDefiningCode;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Verwendung/null_flavour
   */
  @Path("/items[at0014]/null_flavour|defining_code")
  private NullFlavour verwendungNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/Kommentar
   * Description: Zusätzliche Erläuterungen zur Adresse, die nicht in anderen Feldern erfasst werden.
   */
  @Path("/items[at0018]/value|value")
  private String kommentarValue;

  /**
   * Path: Person/Personendaten/Baum/Person/Postfach/Kommentar/null_flavour
   */
  @Path("/items[at0018]/null_flavour|defining_code")
  private NullFlavour kommentarNullFlavourDefiningCode;

  /**
   * Path: Person/Personendaten/Person/Postfach/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setPostfach(List<PostfachPostfachElement> postfach) {
     this.postfach = postfach;
  }

  public List<PostfachPostfachElement> getPostfach() {
     return this.postfach ;
  }

  public void setStadtteilValue(String stadtteilValue) {
     this.stadtteilValue = stadtteilValue;
  }

  public String getStadtteilValue() {
     return this.stadtteilValue ;
  }

  public void setStadtteilNullFlavourDefiningCode(NullFlavour stadtteilNullFlavourDefiningCode) {
     this.stadtteilNullFlavourDefiningCode = stadtteilNullFlavourDefiningCode;
  }

  public NullFlavour getStadtteilNullFlavourDefiningCode() {
     return this.stadtteilNullFlavourDefiningCode ;
  }

  public void setStadtValue(String stadtValue) {
     this.stadtValue = stadtValue;
  }

  public String getStadtValue() {
     return this.stadtValue ;
  }

  public void setStadtNullFlavourDefiningCode(NullFlavour stadtNullFlavourDefiningCode) {
     this.stadtNullFlavourDefiningCode = stadtNullFlavourDefiningCode;
  }

  public NullFlavour getStadtNullFlavourDefiningCode() {
     return this.stadtNullFlavourDefiningCode ;
  }

  public void setGemeindeschluesselValue(String gemeindeschluesselValue) {
     this.gemeindeschluesselValue = gemeindeschluesselValue;
  }

  public String getGemeindeschluesselValue() {
     return this.gemeindeschluesselValue ;
  }

  public void setGemeindeschluesselNullFlavourDefiningCode(
      NullFlavour gemeindeschluesselNullFlavourDefiningCode) {
     this.gemeindeschluesselNullFlavourDefiningCode = gemeindeschluesselNullFlavourDefiningCode;
  }

  public NullFlavour getGemeindeschluesselNullFlavourDefiningCode() {
     return this.gemeindeschluesselNullFlavourDefiningCode ;
  }

  public void setBundesland(DvCodedText bundesland) {
     this.bundesland = bundesland;
  }

  public DvCodedText getBundesland() {
     return this.bundesland ;
  }

  public void setBundeslandNullFlavourDefiningCode(NullFlavour bundeslandNullFlavourDefiningCode) {
     this.bundeslandNullFlavourDefiningCode = bundeslandNullFlavourDefiningCode;
  }

  public NullFlavour getBundeslandNullFlavourDefiningCode() {
     return this.bundeslandNullFlavourDefiningCode ;
  }

  public void setPostleitzahlValue(String postleitzahlValue) {
     this.postleitzahlValue = postleitzahlValue;
  }

  public String getPostleitzahlValue() {
     return this.postleitzahlValue ;
  }

  public void setPostleitzahlNullFlavourDefiningCode(
      NullFlavour postleitzahlNullFlavourDefiningCode) {
     this.postleitzahlNullFlavourDefiningCode = postleitzahlNullFlavourDefiningCode;
  }

  public NullFlavour getPostleitzahlNullFlavourDefiningCode() {
     return this.postleitzahlNullFlavourDefiningCode ;
  }

  public void setLand(DvCodedText land) {
     this.land = land;
  }

  public DvCodedText getLand() {
     return this.land ;
  }

  public void setLandNullFlavourDefiningCode(NullFlavour landNullFlavourDefiningCode) {
     this.landNullFlavourDefiningCode = landNullFlavourDefiningCode;
  }

  public NullFlavour getLandNullFlavourDefiningCode() {
     return this.landNullFlavourDefiningCode ;
  }

  public void setArtDefiningCode(ArtDefiningCode artDefiningCode) {
     this.artDefiningCode = artDefiningCode;
  }

  public ArtDefiningCode getArtDefiningCode() {
     return this.artDefiningCode ;
  }

  public void setArtNullFlavourDefiningCode(NullFlavour artNullFlavourDefiningCode) {
     this.artNullFlavourDefiningCode = artNullFlavourDefiningCode;
  }

  public NullFlavour getArtNullFlavourDefiningCode() {
     return this.artNullFlavourDefiningCode ;
  }

  public void setVerwendungDefiningCode(VerwendungDefiningCode verwendungDefiningCode) {
     this.verwendungDefiningCode = verwendungDefiningCode;
  }

  public VerwendungDefiningCode getVerwendungDefiningCode() {
     return this.verwendungDefiningCode ;
  }

  public void setVerwendungNullFlavourDefiningCode(NullFlavour verwendungNullFlavourDefiningCode) {
     this.verwendungNullFlavourDefiningCode = verwendungNullFlavourDefiningCode;
  }

  public NullFlavour getVerwendungNullFlavourDefiningCode() {
     return this.verwendungNullFlavourDefiningCode ;
  }

  public void setKommentarValue(String kommentarValue) {
     this.kommentarValue = kommentarValue;
  }

  public String getKommentarValue() {
     return this.kommentarValue ;
  }

  public void setKommentarNullFlavourDefiningCode(NullFlavour kommentarNullFlavourDefiningCode) {
     this.kommentarNullFlavourDefiningCode = kommentarNullFlavourDefiningCode;
  }

  public NullFlavour getKommentarNullFlavourDefiningCode() {
     return this.kommentarNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
