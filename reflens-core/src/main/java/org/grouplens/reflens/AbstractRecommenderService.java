package org.grouplens.reflens;

/**
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 *
 */
public abstract class AbstractRecommenderService implements RecommenderService {

	/* (non-Javadoc)
	 * @see org.grouplens.reflens.RecommenderService#getRatingRecommender()
	 */
	@Override
	public RatingRecommender getRatingRecommender() {
		throw new IncompatibleRecommenderException(
				getClass().getName() + " does not support rating-based recommendation");
	}

	/* (non-Javadoc)
	 * @see org.grouplens.reflens.RecommenderService#getRatingPredictor()
	 */
	@Override
	public RatingPredictor getRatingPredictor() {
		throw new IncompatibleRecommenderException(
				getClass().getName() + " does not support rating prediction");
	}

	/* (non-Javadoc)
	 * @see org.grouplens.reflens.RecommenderService#getBasketRecommender()
	 */
	@Override
	public BasketRecommender getBasketRecommender() {
		throw new IncompatibleRecommenderException(
				getClass().getName() + " does not support basket-based recommendation");
	}

}
