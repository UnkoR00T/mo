package ot0;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ot0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0011R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\r\u001a\u0004\b\"\u0010\u0004R\u001a\u0010(\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001a\u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b)\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\r\u001a\u0004\b\u001b\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b\u001f\u00106¨\u00068"}, d2 = {"Lot0/f;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "content", "b", "Z", "()Z", "displayed", "c", "getHasPrivateContent", "getHasPrivateContent$annotations", "()V", "hasPrivateContent", "d", "id", "Lot0/g;", "e", "Lot0/g;", "()Lot0/g;", "parameters", "f", "getReactionDelivered", "reactionDelivered", "g", "sendersId", "Ljava/time/OffsetDateTime;", "h", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "sendingDateTime", "i", "title", "Lot0/b;", "j", "Lot0/b;", "getInteractionType", "()Lot0/b;", "interactionType", "k", "privateContent", "Lot0/m;", "l", "Lot0/m;", "()Lot0/m;", "pushType", "pushservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushHistoryEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("content")
    private final String content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("displayed")
    private final boolean displayed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("hasPrivateContent")
    private final boolean hasPrivateContent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parameters")
    private final PushParametersDto parameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("reactionDelivered")
    private final boolean reactionDelivered;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sendersId")
    private final String sendersId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sendingDateTime")
    private final OffsetDateTime sendingDateTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("interactionType")
    private final b interactionType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("privateContent")
    private final String privateContent;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pushType")
    private final m pushType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisplayed() {
        return this.displayed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final PushParametersDto getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPrivateContent() {
        return this.privateContent;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushHistoryEntryDto)) {
            return false;
        }
        PushHistoryEntryDto pushHistoryEntryDto = (PushHistoryEntryDto) other;
        return t.c(this.content, pushHistoryEntryDto.content) && this.displayed == pushHistoryEntryDto.displayed && this.hasPrivateContent == pushHistoryEntryDto.hasPrivateContent && t.c(this.id, pushHistoryEntryDto.id) && t.c(this.parameters, pushHistoryEntryDto.parameters) && this.reactionDelivered == pushHistoryEntryDto.reactionDelivered && t.c(this.sendersId, pushHistoryEntryDto.sendersId) && t.c(this.sendingDateTime, pushHistoryEntryDto.sendingDateTime) && t.c(this.title, pushHistoryEntryDto.title) && this.interactionType == pushHistoryEntryDto.interactionType && t.c(this.privateContent, pushHistoryEntryDto.privateContent) && this.pushType == pushHistoryEntryDto.pushType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final m getPushType() {
        return this.pushType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSendersId() {
        return this.sendersId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final OffsetDateTime getSendingDateTime() {
        return this.sendingDateTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.content.hashCode() * 31) + Boolean.hashCode(this.displayed)) * 31) + Boolean.hashCode(this.hasPrivateContent)) * 31) + this.id.hashCode()) * 31) + this.parameters.hashCode()) * 31) + Boolean.hashCode(this.reactionDelivered)) * 31) + this.sendersId.hashCode()) * 31) + this.sendingDateTime.hashCode()) * 31) + this.title.hashCode()) * 31;
        b bVar = this.interactionType;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.privateContent;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        m mVar = this.pushType;
        return iHashCode3 + (mVar != null ? mVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "PushHistoryEntryDto(content=" + this.content + ", displayed=" + this.displayed + ", hasPrivateContent=" + this.hasPrivateContent + ", id=" + this.id + ", parameters=" + this.parameters + ", reactionDelivered=" + this.reactionDelivered + ", sendersId=" + this.sendersId + ", sendingDateTime=" + this.sendingDateTime + ", title=" + this.title + ", interactionType=" + this.interactionType + ", privateContent=" + this.privateContent + ", pushType=" + this.pushType + ')';
    }
}
