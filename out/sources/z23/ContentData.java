package z23;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: z23.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ¬\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b7\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010 R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b:\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010\"R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b.\u0010?R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0006¢\u0006\f\n\u0004\b@\u0010>\u001a\u0004\b=\u0010?R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u0010A\u001a\u0004\b3\u0010BR\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b(\u0010C\u001a\u0004\b@\u0010D¨\u0006E"}, d2 = {"Lz23/b;", "", "Lk23/f;", "selectedDateAnswer", "Lhz/b;", "answerValidation", "Lfz/b$c;", "selectedDate", "dateValidation", "Lfz/b$g;", "selectedTime", "timeValidation", "", "description", "descriptionValidation", "", "maxAttachments", "", "Lwx/i;", "addedAttachments", "Ln40/i;", "pickerFiles", "Lg30/v;", "bottomSheetValue", "Ld60/j;", "Lz23/c;", "scrollInstance", "<init>", "(Lk23/f;Lhz/b;Lfz/b$c;Lhz/b;Lfz/b$g;Lhz/b;Ljava/lang/String;Lhz/b;ILjava/util/List;Ljava/util/List;Lg30/v;Ld60/j;)V", "a", "(Lk23/f;Lhz/b;Lfz/b$c;Lhz/b;Lfz/b$g;Lhz/b;Ljava/lang/String;Lhz/b;ILjava/util/List;Ljava/util/List;Lg30/v;Ld60/j;)Lz23/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk23/f;", "m", "()Lk23/f;", "b", "Lhz/b;", "d", "()Lhz/b;", "c", "Lfz/b$c;", "l", "()Lfz/b$c;", "f", "e", "Lfz/b$g;", "n", "()Lfz/b$g;", "o", "g", "Ljava/lang/String;", "h", "i", "I", "j", "Ljava/util/List;", "()Ljava/util/List;", "k", "Lg30/v;", "()Lg30/v;", "Ld60/j;", "()Ld60/j;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final k23.f selectedDateAnswer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b answerValidation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate selectedDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b dateValidation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetTime selectedTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b timeValidation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b descriptionValidation;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxAttachments;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<wx.i> addedAttachments;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<n40.i> pickerFiles;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final g30.v bottomSheetValue;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final d60.j<c> scrollInstance;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentData(k23.f fVar, hz.b bVar, fz.b.LocalDate localDate, hz.b bVar2, fz.b.OffsetTime offsetTime, hz.b bVar3, String str, hz.b bVar4, int i15, List<? extends wx.i> list, List<? extends n40.i> list2, g30.v vVar, d60.j<c> jVar) {
        this.selectedDateAnswer = fVar;
        this.answerValidation = bVar;
        this.selectedDate = localDate;
        this.dateValidation = bVar2;
        this.selectedTime = offsetTime;
        this.timeValidation = bVar3;
        this.description = str;
        this.descriptionValidation = bVar4;
        this.maxAttachments = i15;
        this.addedAttachments = list;
        this.pickerFiles = list2;
        this.bottomSheetValue = vVar;
        this.scrollInstance = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentData b(ContentData contentData, k23.f fVar, hz.b bVar, fz.b.LocalDate localDate, hz.b bVar2, fz.b.OffsetTime offsetTime, hz.b bVar3, String str, hz.b bVar4, int i15, List list, List list2, g30.v vVar, d60.j jVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            fVar = contentData.selectedDateAnswer;
        }
        return contentData.a(fVar, (i16 & 2) != 0 ? contentData.answerValidation : bVar, (i16 & 4) != 0 ? contentData.selectedDate : localDate, (i16 & 8) != 0 ? contentData.dateValidation : bVar2, (i16 & 16) != 0 ? contentData.selectedTime : offsetTime, (i16 & 32) != 0 ? contentData.timeValidation : bVar3, (i16 & 64) != 0 ? contentData.description : str, (i16 & 128) != 0 ? contentData.descriptionValidation : bVar4, (i16 & 256) != 0 ? contentData.maxAttachments : i15, (i16 & 512) != 0 ? contentData.addedAttachments : list, (i16 & 1024) != 0 ? contentData.pickerFiles : list2, (i16 & 2048) != 0 ? contentData.bottomSheetValue : vVar, (i16 & PKIFailureInfo.certConfirmed) != 0 ? contentData.scrollInstance : jVar);
    }

    public final ContentData a(k23.f selectedDateAnswer, hz.b answerValidation, fz.b.LocalDate selectedDate, hz.b dateValidation, fz.b.OffsetTime selectedTime, hz.b timeValidation, String description, hz.b descriptionValidation, int maxAttachments, List<? extends wx.i> addedAttachments, List<? extends n40.i> pickerFiles, g30.v bottomSheetValue, d60.j<c> scrollInstance) {
        return new ContentData(selectedDateAnswer, answerValidation, selectedDate, dateValidation, selectedTime, timeValidation, description, descriptionValidation, maxAttachments, addedAttachments, pickerFiles, bottomSheetValue, scrollInstance);
    }

    public final List<wx.i> c() {
        return this.addedAttachments;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.b getAnswerValidation() {
        return this.answerValidation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentData)) {
            return false;
        }
        ContentData contentData = (ContentData) other;
        return this.selectedDateAnswer == contentData.selectedDateAnswer && fr.t.c(this.answerValidation, contentData.answerValidation) && fr.t.c(this.selectedDate, contentData.selectedDate) && fr.t.c(this.dateValidation, contentData.dateValidation) && fr.t.c(this.selectedTime, contentData.selectedTime) && fr.t.c(this.timeValidation, contentData.timeValidation) && fr.t.c(this.description, contentData.description) && fr.t.c(this.descriptionValidation, contentData.descriptionValidation) && this.maxAttachments == contentData.maxAttachments && fr.t.c(this.addedAttachments, contentData.addedAttachments) && fr.t.c(this.pickerFiles, contentData.pickerFiles) && this.bottomSheetValue == contentData.bottomSheetValue && fr.t.c(this.scrollInstance, contentData.scrollInstance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.b getDateValidation() {
        return this.dateValidation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final hz.b getDescriptionValidation() {
        return this.descriptionValidation;
    }

    public int hashCode() {
        k23.f fVar = this.selectedDateAnswer;
        int iHashCode = (((fVar == null ? 0 : fVar.hashCode()) * 31) + this.answerValidation.hashCode()) * 31;
        fz.b.LocalDate localDate = this.selectedDate;
        int iHashCode2 = (((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.dateValidation.hashCode()) * 31;
        fz.b.OffsetTime offsetTime = this.selectedTime;
        int iHashCode3 = (((((((((((((((iHashCode2 + (offsetTime == null ? 0 : offsetTime.hashCode())) * 31) + this.timeValidation.hashCode()) * 31) + this.description.hashCode()) * 31) + this.descriptionValidation.hashCode()) * 31) + Integer.hashCode(this.maxAttachments)) * 31) + this.addedAttachments.hashCode()) * 31) + this.pickerFiles.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31;
        d60.j<c> jVar = this.scrollInstance;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getMaxAttachments() {
        return this.maxAttachments;
    }

    public final List<n40.i> j() {
        return this.pickerFiles;
    }

    public final d60.j<c> k() {
        return this.scrollInstance;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final fz.b.LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final k23.f getSelectedDateAnswer() {
        return this.selectedDateAnswer;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final fz.b.OffsetTime getSelectedTime() {
        return this.selectedTime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final hz.b getTimeValidation() {
        return this.timeValidation;
    }

    public String toString() {
        return "ContentData(selectedDateAnswer=" + this.selectedDateAnswer + ", answerValidation=" + this.answerValidation + ", selectedDate=" + this.selectedDate + ", dateValidation=" + this.dateValidation + ", selectedTime=" + this.selectedTime + ", timeValidation=" + this.timeValidation + ", description=" + this.description + ", descriptionValidation=" + this.descriptionValidation + ", maxAttachments=" + this.maxAttachments + ", addedAttachments=" + this.addedAttachments + ", pickerFiles=" + this.pickerFiles + ", bottomSheetValue=" + this.bottomSheetValue + ", scrollInstance=" + this.scrollInstance + ')';
    }
}
