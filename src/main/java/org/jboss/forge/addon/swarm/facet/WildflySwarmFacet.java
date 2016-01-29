package org.jboss.forge.addon.swarm.facet;

import java.util.List;

import org.jboss.forge.addon.projects.ProjectFacet;
import org.jboss.forge.addon.swarm.config.WildflySwarmConfiguration;
import org.wildfly.swarm.fractionlist.FractionDescriptor;

/**
 * The Wildfly-Swarm Facet
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 * @author <a href="mailto:antonio.goncalves@gmail.com">Antonio Goncalves</a>
 */
public interface WildflySwarmFacet extends ProjectFacet
{
   WildflySwarmConfiguration getConfiguration();

   void setConfiguration(WildflySwarmConfiguration configuration);

   void installFractions(Iterable<FractionDescriptor> selectedFractions);

   List<FractionDescriptor> getFractionList();
}
