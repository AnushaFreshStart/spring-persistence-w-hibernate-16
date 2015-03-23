package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class AggregateRating extends Rating {


    @ManyToOne
    private Thing itemReviewed;
    private Integer ratingCount;
    private Integer reviewCount;

    public Thing getItemReviewed() {
        return itemReviewed;
    }

    public void setItemReviewed(Thing itemReviewed) {
        this.itemReviewed = itemReviewed;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }
}
