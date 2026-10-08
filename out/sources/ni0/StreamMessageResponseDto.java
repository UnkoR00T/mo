package ni0;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ni0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b \u0010\u0013R\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b\"\u0010\u0013¨\u0006$"}, d2 = {"Lni0/l;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "content", "", "Lni0/b;", "Ljava/util/List;", "()Ljava/util/List;", "actions", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "currentMessages", "d", "responseId", "e", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "showRating", "Lni0/j;", "f", "sources", "g", "suggestions", "chatservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreamMessageResponseDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("content")
    private final String content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("actions")
    private final List<ActionPlanDto> actions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("currentMessages")
    private final Integer currentMessages;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("responseId")
    private final String responseId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("showRating")
    private final Boolean showRating;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sources")
    private final List<SourceDto> sources;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("suggestions")
    private final List<String> suggestions;

    public final List<ActionPlanDto> a() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getCurrentMessages() {
        return this.currentMessages;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResponseId() {
        return this.responseId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getShowRating() {
        return this.showRating;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamMessageResponseDto)) {
            return false;
        }
        StreamMessageResponseDto streamMessageResponseDto = (StreamMessageResponseDto) other;
        return t.c(this.content, streamMessageResponseDto.content) && t.c(this.actions, streamMessageResponseDto.actions) && t.c(this.currentMessages, streamMessageResponseDto.currentMessages) && t.c(this.responseId, streamMessageResponseDto.responseId) && t.c(this.showRating, streamMessageResponseDto.showRating) && t.c(this.sources, streamMessageResponseDto.sources) && t.c(this.suggestions, streamMessageResponseDto.suggestions);
    }

    public final List<SourceDto> f() {
        return this.sources;
    }

    public final List<String> g() {
        return this.suggestions;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        List<ActionPlanDto> list = this.actions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.currentMessages;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.responseId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showRating;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<SourceDto> list2 = this.sources;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.suggestions;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "StreamMessageResponseDto(content=" + this.content + ", actions=" + this.actions + ", currentMessages=" + this.currentMessages + ", responseId=" + this.responseId + ", showRating=" + this.showRating + ", sources=" + this.sources + ", suggestions=" + this.suggestions + ')';
    }
}
