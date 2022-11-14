package org.example.syntheakds.processing.openehr.generated.kdsdiagnosecomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class KlinischerStatusClusterContainment extends Containment {
  public SelectAqlField<KlinischerStatusCluster> KLINISCHER_STATUS_CLUSTER = new AqlFieldImp<KlinischerStatusCluster>(KlinischerStatusCluster.class, "", "KlinischerStatusCluster", KlinischerStatusCluster.class, this);

  public SelectAqlField<KlinischerStatusDefiningCode> KLINISCHER_STATUS_DEFINING_CODE = new AqlFieldImp<KlinischerStatusDefiningCode>(KlinischerStatusCluster.class, "/items[at0003]/value|defining_code", "klinischerStatusDefiningCode", KlinischerStatusDefiningCode.class, this);

  public SelectAqlField<NullFlavour> KLINISCHER_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(KlinischerStatusCluster.class, "/items[at0003]/null_flavour|defining_code", "klinischerStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(KlinischerStatusCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private KlinischerStatusClusterContainment() {
    super("openEHR-EHR-CLUSTER.problem_qualifier.v1");
  }

  public static KlinischerStatusClusterContainment getInstance() {
    return new KlinischerStatusClusterContainment();
  }
}
