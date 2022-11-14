package org.example.syntheakds.processing.openehr.generated.kdsdiagnosecomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvCodedText;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-11-02T11:31:18.541638+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.23.0-SNAPSHOT"
)
public class PrimaercodeSeitenlokalisationElement implements LocatableEntity {
  /**
   * Path: Diagnose/Primärcode/Seitenlokalisation
   * Description: Identifikation einer einfachen Körperstelle zur Lokalisierung des Problems oder der Diagnose.
   * Comment: Wo dies möglich ist, ist die Kodierung der anatomischen Lokalisation über eine Terminologie zu bevorzugen. Verwenden Sie dieses Datenelement, um vorab präkoordinierte anatomische Lokalisationen zu erfassen. Wenn die Anforderungen an die Erfassung der anatomischen Lokalisation zur Laufzeit durch die Anwendung bestimmt werden oder komplexere Modellierungen, wie z.B. relative Lokalisationen erforderlich sind, dann verwenden Sie in diesem Archetyp den CLUSTER.anatomical_location oder CLUSTER.relative_location innerhalb des SLOT 'Structured anatomical location'. Die Anzahl für dieses Datenelement ist unbegrenzt, um klinische Szenarien wie die Beschreibung eines Hautausschlags an mehreren Stellen zu ermöglichen, wobei jedoch alle anderen Attribute identisch sind. Falls die anatomische Lage über präkoordinierte Codes im Namen des Problems/Diagnose enthalten ist, wird dieses Datenelement überflüssig.
   */
  @Path("/value")
  private DvCodedText value;

  /**
   * Path: Diagnose/Primärcode/Structure/Seitenlokalisation/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: Diagnose/Primärcode/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(DvCodedText value) {
     this.value = value;
  }

  public DvCodedText getValue() {
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
