/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.chat.v2.service.channel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
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
public class Member extends Resource {
    private static final long serialVersionUID = 35425349237098L;

    public enum WebhookEnabledType {
        TRUE("true"),
        FALSE("false");

        private final String value;

        private WebhookEnabledType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a WebhookEnabledType from a string.
         * @param value string value
         * @return generated WebhookEnabledType
         */
        @JsonCreator
        public static WebhookEnabledType forValue(final String value) {
            return Promoter.enumFromString(value, WebhookEnabledType.values());
        }
    }

    /**
     * Create a MemberFetcher to execute fetch.
     *
     * @param pathServiceSid The SID of the Service to fetch the resource from
     * @param pathChannelSid The SID of the channel the member belongs to
     * @param pathSid The SID of the Member resource to fetch
     * @return MemberFetcher capable of executing the fetch
     */
    public static MemberFetcher fetcher(final String pathServiceSid,
                                        final String pathChannelSid,
                                        final String pathSid) {
        return new MemberFetcher(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Create a MemberCreator to execute create.
     *
     * @param pathServiceSid The SID of the Service to create the resource under
     * @param pathChannelSid The SID of the channel the new member belongs to
     * @param identity The `identity` value that identifies the new resource's User
     * @return MemberCreator capable of executing the create
     */
    public static MemberCreator creator(final String pathServiceSid,
                                        final String pathChannelSid,
                                        final String identity) {
        return new MemberCreator(pathServiceSid, pathChannelSid, identity);
    }

    /**
     * Create a MemberReader to execute read.
     *
     * @param pathServiceSid The SID of the Service to read the resources from
     * @param pathChannelSid The SID of the channel the member belongs to
     * @return MemberReader capable of executing the read
     */
    public static MemberReader reader(final String pathServiceSid,
                                      final String pathChannelSid) {
        return new MemberReader(pathServiceSid, pathChannelSid);
    }

    /**
     * Create a MemberDeleter to execute delete.
     *
     * @param pathServiceSid The SID of the Service to delete the resource from
     * @param pathChannelSid The SID of the channel the Member resource to delete
     *                       belongs to
     * @param pathSid The SID of the Member resource to delete
     * @return MemberDeleter capable of executing the delete
     */
    public static MemberDeleter deleter(final String pathServiceSid,
                                        final String pathChannelSid,
                                        final String pathSid) {
        return new MemberDeleter(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Create a MemberUpdater to execute update.
     *
     * @param pathServiceSid The SID of the Service to create the resource under
     * @param pathChannelSid The SID of the channel the member to update belongs to
     * @param pathSid The SID of the Member resource to update
     * @return MemberUpdater capable of executing the update
     */
    public static MemberUpdater updater(final String pathServiceSid,
                                        final String pathChannelSid,
                                        final String pathSid) {
        return new MemberUpdater(pathServiceSid, pathChannelSid, pathSid);
    }

    /**
     * Converts a JSON String into a Member object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Member object represented by the provided JSON
     */
    public static Member fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Member.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Member object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Member object represented by the provided JSON
     */
    public static Member fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Member.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String accountSid;
    private final String channelSid;
    private final String serviceSid;
    private final String identity;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String roleSid;
    private final Integer lastConsumedMessageIndex;
    private final DateTime lastConsumptionTimestamp;
    private final URI url;
    private final String attributes;

    @JsonCreator
    private Member(@JsonProperty("sid")
                   final String sid,
                   @JsonProperty("account_sid")
                   final String accountSid,
                   @JsonProperty("channel_sid")
                   final String channelSid,
                   @JsonProperty("service_sid")
                   final String serviceSid,
                   @JsonProperty("identity")
                   final String identity,
                   @JsonProperty("date_created")
                   final String dateCreated,
                   @JsonProperty("date_updated")
                   final String dateUpdated,
                   @JsonProperty("role_sid")
                   final String roleSid,
                   @JsonProperty("last_consumed_message_index")
                   final Integer lastConsumedMessageIndex,
                   @JsonProperty("last_consumption_timestamp")
                   final String lastConsumptionTimestamp,
                   @JsonProperty("url")
                   final URI url,
                   @JsonProperty("attributes")
                   final String attributes) {
        this.sid = sid;
        this.accountSid = accountSid;
        this.channelSid = channelSid;
        this.serviceSid = serviceSid;
        this.identity = identity;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.roleSid = roleSid;
        this.lastConsumedMessageIndex = lastConsumedMessageIndex;
        this.lastConsumptionTimestamp = DateConverter.iso8601DateTimeFromString(lastConsumptionTimestamp);
        this.url = url;
        this.attributes = attributes;
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
     * Returns The SID of the Account that created the resource.
     *
     * @return The SID of the Account that created the resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The SID of the Channel for the member.
     *
     * @return The SID of the Channel for the member
     */
    public final String getChannelSid() {
        return this.channelSid;
    }

    /**
     * Returns The SID of the Service that the resource is associated with.
     *
     * @return The SID of the Service that the resource is associated with
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The string that identifies the resource's User.
     *
     * @return The string that identifies the resource's User
     */
    public final String getIdentity() {
        return this.identity;
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
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The SID of the Role assigned to the member.
     *
     * @return The SID of the Role assigned to the member
     */
    public final String getRoleSid() {
        return this.roleSid;
    }

    /**
     * Returns The index of the last Message that the Member has read within the
     * Channel.
     *
     * @return The index of the last Message that the Member has read within the
     *         Channel
     */
    public final Integer getLastConsumedMessageIndex() {
        return this.lastConsumedMessageIndex;
    }

    /**
     * Returns The ISO 8601 based timestamp string that represents the datetime of
     * the last Message read event for the Member within the Channel.
     *
     * @return The ISO 8601 based timestamp string that represents the datetime of
     *         the last Message read event for the Member within the Channel
     */
    public final DateTime getLastConsumptionTimestamp() {
        return this.lastConsumptionTimestamp;
    }

    /**
     * Returns The absolute URL of the Member resource.
     *
     * @return The absolute URL of the Member resource
     */
    public final URI getUrl() {
        return this.url;
    }

    /**
     * Returns The JSON string that stores application-specific data.
     *
     * @return The JSON string that stores application-specific data
     */
    public final String getAttributes() {
        return this.attributes;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Member other = (Member) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(channelSid, other.channelSid) &&
               Objects.equals(serviceSid, other.serviceSid) &&
               Objects.equals(identity, other.identity) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(roleSid, other.roleSid) &&
               Objects.equals(lastConsumedMessageIndex, other.lastConsumedMessageIndex) &&
               Objects.equals(lastConsumptionTimestamp, other.lastConsumptionTimestamp) &&
               Objects.equals(url, other.url) &&
               Objects.equals(attributes, other.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            accountSid,
                            channelSid,
                            serviceSid,
                            identity,
                            dateCreated,
                            dateUpdated,
                            roleSid,
                            lastConsumedMessageIndex,
                            lastConsumptionTimestamp,
                            url,
                            attributes);
    }
}