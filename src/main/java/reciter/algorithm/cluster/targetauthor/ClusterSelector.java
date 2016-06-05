package reciter.algorithm.cluster.targetauthor;

import java.util.Map;
import java.util.Set;

import reciter.algorithm.cluster.model.ReCiterCluster;
import reciter.algorithm.evidence.targetauthor.TargetAuthorStrategyContext;
import reciter.model.author.TargetAuthor;

public interface ClusterSelector {

	void runSelectionStrategy(Map<Long, ReCiterCluster> clusters, TargetAuthor targetAuthor);
	
	Set<Long> getSelectedClusterIds();
	
	void handleNonSelectedClusters(TargetAuthorStrategyContext strategyContext, Map<Long, ReCiterCluster> clusters, TargetAuthor targetAuthor);
}
