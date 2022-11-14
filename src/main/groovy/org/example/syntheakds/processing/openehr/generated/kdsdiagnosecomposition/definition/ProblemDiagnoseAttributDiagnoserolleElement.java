package org.example.syntheakds.processing.openehr.generated.kdsdiagnosecomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-11-02T11:31:18.485235200+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.23.0-SNAPSHOT"
)
public class ProblemDiagnoseAttributDiagnoserolleElement implements LocatableEntity {
  /**
   * Path: Diagnose/context/Problem/Diagnose Attribut/Diagnoserolle
   * Description: Die Kategorie des Problems oder der Diagnose innerhalb eines spezifischen Behandlungszeitraumes und/oder eines lokalen Behandlungskontextes.
   * Comment: Dieses Datenelement enthält eine Gruppe von Werten, welche üblicherweise in der diagnostischen Kategorisierung benutzt werden. Es ist üblich, dass im episodischen Versorgungskontext (üblicherweise in der Sekundärversorgung) die Diagnosen während der aktuellen Versorgungsepisode nach ihrer Beziehung zur Hauptdiagnose zu kategorisieren/ zu organisieren sind. Diese Kategorien können ebenfalls für die klinische Kodierungs-, Berichts- und Abrechnungszwecke verwendet werden. In manchen Ländern kann die diagnostische Kategorisierung als DRG (diagnosebezogene Fallgruppierungen) bezeichnet werden.
   * Falls es nötig sein sollte, erlaubt das Freitextfeld die Benutzung von lokalen Werten.
   */
  @Path("/value|defining_code")
  private DiagnoserolleDefiningCode value;

  /**
   * Path: Diagnose/context/Tree/Problem/Diagnose Attribut/Diagnoserolle/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: Diagnose/context/Problem/Diagnose Attribut/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(DiagnoserolleDefiningCode value) {
     this.value = value;
  }

  public DiagnoserolleDefiningCode getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
