/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import lombok.ToString;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Worker extends Resource {
    private static final long serialVersionUID = 71992031157502L;

    /**
     * Create a WorkerReader to execute read.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Workers to read
     * @return WorkerReader capable of executing the read
     */
    public static WorkerReader reader(final String pathWorkspaceSid) {
        return new WorkerReader(pathWorkspaceSid);
    }

    /**
     * Create a WorkerCreator to execute create.
     *
     * @param pathWorkspaceSid The SID of the Workspace that the new Worker belongs
     *                         to
     * @param friendlyName A string to describe the resource
     * @return WorkerCreator capable of executing the create
     */
    public static WorkerCreator creator(final String pathWorkspaceSid,
                                        final String friendlyName) {
        return new WorkerCreator(pathWorkspaceSid, friendlyName);
    }

    /**
     * Create a WorkerFetcher to execute fetch.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Worker to fetch
     * @param pathSid The SID of the resource to fetch
     * @return WorkerFetcher capable of executing the fetch
     */
    public static WorkerFetcher fetcher(final String pathWorkspaceSid,
                                        final String pathSid) {
        return new WorkerFetcher(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a WorkerUpdater to execute update.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Worker to update
     * @param pathSid The SID of the resource to update
     * @return WorkerUpdater capable of executing the update
     */
    public static WorkerUpdater updater(final String pathWorkspaceSid,
                                        final String pathSid) {
        return new WorkerUpdater(pathWorkspaceSid, pathSid);
    }

    /**
     * Create a WorkerDeleter to execute delete.
     *
     * @param pathWorkspaceSid The SID of the Workspace with the Worker to delete
     * @param pathSid The SID of the resource to delete
     * @return WorkerDeleter capable of executing the delete
     */
    public static WorkerDeleter deleter(final String pathWorkspaceSid,
                                        final String pathSid) {
        return new WorkerDeleter(pathWorkspaceSid, pathSid);
    }

    /**
     * Converts a JSON String into a Worker object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Worker object represented by the provided JSON
     */
    public static Worker fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Worker.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Worker object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Worker object represented by the provided JSON
     */
    public static Worker fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Worker.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String activityName;
    private final String activitySid;
    private final String attributes;
    private final Boolean available;
    private final DateTime dateCreated;
    private final DateTime dateStatusChanged;
    private final DateTime dateUpdated;
    private final String friendlyName;
    private final String sid;
    private final String workspaceSid;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Worker(@JsonProperty("account_sid")
                   final String accountSid,
                   @JsonProperty("activity_name")
                   final String activityName,
                   @JsonProperty("activity_sid")
                   final String activitySid,
                   @JsonProperty("attributes")
                   final String attributes,
                   @JsonProperty("available")
                   final Boolean available,
                   @JsonProperty("date_created")
                   final String dateCreated,
                   @JsonProperty("date_status_changed")
                   final String dateStatusChanged,
                   @JsonProperty("date_updated")
                   final String dateUpdated,
                   @JsonProperty("friendly_name")
                   final String friendlyName,
                   @JsonProperty("sid")
                   final String sid,
                   @JsonProperty("workspace_sid")
                   final String workspaceSid,
                   @JsonProperty("url")
                   final URI url,
                   @JsonProperty("links")
                   final Map<String, String> links) {
        this.accountSid = accountSid;
        this.activityName = activityName;
        this.activitySid = activitySid;
        this.attributes = attributes;
        this.available = available;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateStatusChanged = DateConverter.iso8601DateTimeFromString(dateStatusChanged);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.sid = sid;
        this.workspaceSid = workspaceSid;
        this.url = url;
        this.links = links;
    }

    /**
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The friendly_name of the Worker's current Activity.
     *
     * @return The friendly_name of the Worker's current Activity
     */
    public final String getActivityName() {
        return this.activityName;
    }

    /**
     * Returns The SID of the Worker's current Activity.
     *
     * @return The SID of the Worker's current Activity
     */
    public final String getActivitySid() {
        return this.activitySid;
    }

    /**
     * Returns The JSON string that describes the Worker.
     *
     * @return The JSON string that describes the Worker
     */
    public final String getAttributes() {
        return this.attributes;
    }

    /**
     * Returns Whether the Worker is available to perform tasks.
     *
     * @return Whether the Worker is available to perform tasks
     */
    public final Boolean getAvailable() {
        return this.available;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The date and time in GMT of the last change to the Worker's activity.
     *
     * @return The date and time in GMT of the last change to the Worker's activity
     */
    public final DateTime getDateStatusChanged() {
        return this.dateStatusChanged;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The string that you assigned to describe the resource.
     *
     * @return The string that you assigned to describe the resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The SID of the Workspace that contains the Worker.
     *
     * @return The SID of the Workspace that contains the Worker
     */
    public final String getWorkspaceSid() {
        return this.workspaceSid;
    }

    /**
     * Returns The absolute URL of the Worker resource.
     *
     * @return The absolute URL of the Worker resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The URLs of related resources.
     *
     * @return The URLs of related resources
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Worker other = (Worker) o;

        return Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(activityName, other.activityName) &&
               Objects.equals(activitySid, other.activitySid) &&
               Objects.equals(attributes, other.attributes) &&
               Objects.equals(available, other.available) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateStatusChanged, other.dateStatusChanged) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(sid, other.sid) &&
               Objects.equals(workspaceSid, other.workspaceSid) &&
               Objects.equals(url, other.url) &&
               Objects.equals(links, other.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            activityName,
                            activitySid,
                            attributes,
                            available,
                            dateCreated,
                            dateStatusChanged,
                            dateUpdated,
                            friendlyName,
                            sid,
                            workspaceSid,
                            url,
                            links);
    }
}