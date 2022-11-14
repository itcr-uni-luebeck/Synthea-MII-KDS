package org.example.syntheakds.processing.openehr.generated.kdspersoncomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class OrganisationClusterContainment extends Containment {
  public SelectAqlField<OrganisationCluster> ORGANISATION_CLUSTER = new AqlFieldImp<OrganisationCluster>(OrganisationCluster.class, "", "OrganisationCluster", OrganisationCluster.class, this);

  public SelectAqlField<String> NAMENSZEILE_VALUE = new AqlFieldImp<String>(OrganisationCluster.class, "/items[at0001]/value|value", "namenszeileValue", String.class, this);

  public SelectAqlField<NullFlavour> NAMENSZEILE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OrganisationCluster.class, "/items[at0001]/null_flavour|defining_code", "namenszeileNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<VerwaltungsorganisationIdentifierElement> IDENTIFIER = new ListAqlFieldImp<VerwaltungsorganisationIdentifierElement>(OrganisationCluster.class, "/items[at0003]", "identifier", VerwaltungsorganisationIdentifierElement.class, this);

  public ListSelectAqlField<OrganisationFunktionElement> FUNKTION = new ListAqlFieldImp<OrganisationFunktionElement>(OrganisationCluster.class, "/items[at0004]", "funktion", OrganisationFunktionElement.class, this);

  public ListSelectAqlField<Cluster> ADRESSE = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0005]", "adresse", Cluster.class, this);

  public ListSelectAqlField<Cluster> ELEKTRONISCHE_KOMMUNIKATION = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0022]", "elektronischeKommunikation", Cluster.class, this);

  public ListSelectAqlField<Cluster> KONTAKTPERSON = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0002]", "kontaktperson", Cluster.class, this);

  public ListSelectAqlField<Cluster> MUTTERGESELLSCHAFT = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0021]", "muttergesellschaft", Cluster.class, this);

  public ListSelectAqlField<Cluster> ZUSAETZLICHE_DETAILS = new ListAqlFieldImp<Cluster>(OrganisationCluster.class, "/items[at0017]", "zusaetzlicheDetails", Cluster.class, this);

  public SelectAqlField<String> KOMMENTAR_VALUE = new AqlFieldImp<String>(OrganisationCluster.class, "/items[at0019]/value|value", "kommentarValue", String.class, this);

  public SelectAqlField<NullFlavour> KOMMENTAR_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(OrganisationCluster.class, "/items[at0019]/null_flavour|defining_code", "kommentarNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(OrganisationCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private OrganisationClusterContainment() {
    super("openEHR-EHR-CLUSTER.organisation.v1");
  }

  public static OrganisationClusterContainment getInstance() {
    return new OrganisationClusterContainment();
  }
}
