package reciter.algorithm.evidence.targetauthor.articlesize;

import java.util.List;

import reciter.algorithm.evidence.targetauthor.TargetAuthorStrategy;
import reciter.algorithm.evidence.targetauthor.TargetAuthorStrategyContext;
import reciter.model.article.ReCiterArticle;
import reciter.model.author.TargetAuthor;

public class ArticleSizeStrategyContext implements TargetAuthorStrategyContext {

	private final TargetAuthorStrategy strategy;
	
	public ArticleSizeStrategyContext(TargetAuthorStrategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public double executeStrategy(List<ReCiterArticle> reCiterArticles, TargetAuthor targetAuthor) {
		return strategy.executeStrategy(reCiterArticles, targetAuthor);
	}

	@Override
	public double executeStrategy(ReCiterArticle reCiterArticle, TargetAuthor targetAuthor) {
		return strategy.executeStrategy(reCiterArticle, targetAuthor);
	}
}
