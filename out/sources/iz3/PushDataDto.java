package iz3;

import fr.k;
import fr.t;
import java.time.OffsetDateTime;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: iz3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b \u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b$\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b(\u0010+¨\u0006,"}, d2 = {"Liz3/d;", "", "", "id", "Liz3/b;", "mobileView", "Liz3/e;", "parameters", "privateText", "Ljava/time/OffsetDateTime;", "sendDateTime", "text", "title", "Liz3/f;", "type", "<init>", "(Ljava/lang/String;Liz3/b;Liz3/e;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Liz3/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liz3/b;", "getMobileView", "()Liz3/b;", "c", "Liz3/e;", "()Liz3/e;", "d", "e", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "f", "g", "h", "Liz3/f;", "()Liz3/f;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("mobileView")
    private final b mobileView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("parameters")
    private final PushParametersDto parameters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("privateText")
    private final String privateText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("sendDateTime")
    private final OffsetDateTime sendDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("text")
    private final String text;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("title")
    private final String title;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final f type;

    public PushDataDto() {
        this(null, null, null, null, null, null, null, null, GF2Field.MASK, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PushParametersDto getParameters() {
        return this.parameters;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrivateText() {
        return this.privateText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final OffsetDateTime getSendDateTime() {
        return this.sendDateTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushDataDto)) {
            return false;
        }
        PushDataDto pushDataDto = (PushDataDto) other;
        return t.c(this.id, pushDataDto.id) && this.mobileView == pushDataDto.mobileView && t.c(this.parameters, pushDataDto.parameters) && t.c(this.privateText, pushDataDto.privateText) && t.c(this.sendDateTime, pushDataDto.sendDateTime) && t.c(this.text, pushDataDto.text) && t.c(this.title, pushDataDto.title) && this.type == pushDataDto.type;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b bVar = this.mobileView;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        PushParametersDto pushParametersDto = this.parameters;
        int iHashCode3 = (iHashCode2 + (pushParametersDto == null ? 0 : pushParametersDto.hashCode())) * 31;
        String str2 = this.privateText;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.sendDateTime;
        int iHashCode5 = (iHashCode4 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        f fVar = this.type;
        return iHashCode7 + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "PushDataDto(id=" + this.id + ", mobileView=" + this.mobileView + ", parameters=" + this.parameters + ", privateText=" + this.privateText + ", sendDateTime=" + this.sendDateTime + ", text=" + this.text + ", title=" + this.title + ", type=" + this.type + ')';
    }

    public PushDataDto(String str, b bVar, PushParametersDto pushParametersDto, String str2, OffsetDateTime offsetDateTime, String str3, String str4, f fVar) {
        this.id = str;
        this.mobileView = bVar;
        this.parameters = pushParametersDto;
        this.privateText = str2;
        this.sendDateTime = offsetDateTime;
        this.text = str3;
        this.title = str4;
        this.type = fVar;
    }

    public /* synthetic */ PushDataDto(String str, b bVar, PushParametersDto pushParametersDto, String str2, OffsetDateTime offsetDateTime, String str3, String str4, f fVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : bVar, (i15 & 4) != 0 ? null : pushParametersDto, (i15 & 8) != 0 ? null : str2, (i15 & 16) != 0 ? null : offsetDateTime, (i15 & 32) != 0 ? null : str3, (i15 & 64) != 0 ? null : str4, (i15 & 128) != 0 ? null : fVar);
    }
}
