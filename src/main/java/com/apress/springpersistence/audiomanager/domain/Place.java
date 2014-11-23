package com.apress.springpersistence.audiomanager.domain;

import com.apress.springpersistence.audiomanager.domain.components.GeoCoordinates;
import com.apress.springpersistence.audiomanager.domain.components.PostalAddress;

import javax.persistence.*;
import java.net.URL;

/**
 * Created by pfisher on 10/1/14.
 */
@Entity
@PrimaryKeyJoinColumn(name="THING_URL")
public class Place extends Thing {

    @Column(name = "THING_URL", nullable = false, unique = true)
    private URL thingUrl; // this is what joins this entity with the Thing entity (essentially thing.url == creativeWork.thing_url

    @Embedded
    private PostalAddress address;
    @ManyToOne
    private AggregateRating aggregateRating;
    @ManyToOne
    private Place containedIn;
    @ManyToOne
    private Event event;
    private String faxNumber;
    @Embedded
    private GeoCoordinates geo;
    private String globalLocationNumber;
    private URL hasMap;
    private String interactionCount;
    private String isIcv4;
    private URL logo;
    @ManyToOne
    private Review review;
    private String telephone;

    public URL getThingUrl() {
        return thingUrl;
    }

    public void setThingUrl(URL thingUrl) {
        this.thingUrl = thingUrl;
    }

    public PostalAddress getAddress() {
        return address;
    }

    public void setAddress(PostalAddress address) {
        this.address = address;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public Place getContainedIn() {
        return containedIn;
    }

    public void setContainedIn(Place containedIn) {
        this.containedIn = containedIn;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public GeoCoordinates getGeo() {
        return geo;
    }

    public void setGeo(GeoCoordinates geo) {
        this.geo = geo;
    }

    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    public URL getHasMap() {
        return hasMap;
    }

    public void setHasMap(URL hasMap) {
        this.hasMap = hasMap;
    }

    public String getInteractionCount() {
        return interactionCount;
    }

    public void setInteractionCount(String interactionCount) {
        this.interactionCount = interactionCount;
    }

    public String getIsIcv4() {
        return isIcv4;
    }

    public void setIsIcv4(String isIcv4) {
        this.isIcv4 = isIcv4;
    }

    public URL getLogo() {
        return logo;
    }

    public void setLogo(URL logo) {
        this.logo = logo;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
