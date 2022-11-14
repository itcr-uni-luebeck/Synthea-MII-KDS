package org.example.syntheakds.processing.openehr.generated.kdsprozedurcomposition.definition;

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
    date = "2022-11-02T11:31:51.001538300+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.23.0-SNAPSHOT"
)
public class ProzedurSeitenlokalisationElement implements LocatableEntity {
  /**
   * Path: KDS_Prozedur/Prozedur/Seitenlokalisation
   * Description: Anatomische Lokalisation, an der die Prozedur durchgeführt wird.
   * Comment: Das Vorkommen dieses Datenelements ist nicht eingeschränkt. Dies ermöglicht die Darstellung von klinischen Situationen, in denen alle Eigenschaften, ausgenommen die anatomische Lokalisation, identisch sind, wie z.B. das Entfernen mehrerer Hautläsionen an verschiedenen Stellen. Verwenden Sie dieses Datenelement, um einfache Begriffe oder präkoordinierte anatomische Lokalisationen aufzunehmen. Wenn die Anforderungen an die Erfassung der anatomischen Lokalisation zur Laufzeit durch die Anwendung festgelegt werden oder komplexere Modellierungen wie z.B. die relative Lokalisation erforderlich sind, verwenden Sie entweder CLUSTER.anatomical_location oder CLUSTER.relative_location innerhalb des Slots "Details zur Prozedur" in diesem Archetyp. Wird die anatomische Lokalisation über vordefinierte Codes in den Namen der Prozedur aufgenommen, wird dieses Datenelement redundant.
   */
  @Path("/value")
  private DvCodedText value;

  /**
   * Path: KDS_Prozedur/Prozedur/Tree/Seitenlokalisation/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: KDS_Prozedur/Prozedur/feeder_audit
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
