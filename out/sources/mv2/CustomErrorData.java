package mv2;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import wq.b;

/* JADX INFO: renamed from: mv2.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lmv2/a;", "", "Lmx/a;", "title", "message", "Lmv2/a$a;", "navigationIcon", "buttonLabel", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Lmx/a;Lmx/a;Lmv2/a$a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "c", "Lmv2/a$a;", "()Lmv2/a$a;", "d", "Ler/a;", "()Ler/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomErrorData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label message;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC3191a navigationIcon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label buttonLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseClick;

    /* JADX INFO: renamed from: mv2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmv2/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC3191a {
        BACK,
        CLOSE;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f128682d = b.a(b());
    }

    public CustomErrorData(Label label, Label label2, EnumC3191a enumC3191a, Label label3, er.a<i0> aVar) {
        this.title = label;
        this.message = label2;
        this.navigationIcon = enumC3191a;
        this.buttonLabel = label3;
        this.onCloseClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getButtonLabel() {
        return this.buttonLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC3191a getNavigationIcon() {
        return this.navigationIcon;
    }

    public final er.a<i0> d() {
        return this.onCloseClick;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomErrorData)) {
            return false;
        }
        CustomErrorData customErrorData = (CustomErrorData) other;
        return t.c(this.title, customErrorData.title) && t.c(this.message, customErrorData.message) && this.navigationIcon == customErrorData.navigationIcon && t.c(this.buttonLabel, customErrorData.buttonLabel) && t.c(this.onCloseClick, customErrorData.onCloseClick);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Label label = this.message;
        int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.navigationIcon.hashCode()) * 31;
        Label label2 = this.buttonLabel;
        return ((iHashCode2 + (label2 != null ? label2.hashCode() : 0)) * 31) + this.onCloseClick.hashCode();
    }

    public String toString() {
        return "CustomErrorData(title=" + this.title + ", message=" + this.message + ", navigationIcon=" + this.navigationIcon + ", buttonLabel=" + this.buttonLabel + ", onCloseClick=" + this.onCloseClick + ')';
    }

    public /* synthetic */ CustomErrorData(Label label, Label label2, EnumC3191a enumC3191a, Label label3, er.a aVar, int i15, k kVar) {
        this(label, (i15 & 2) != 0 ? null : label2, enumC3191a, label3, aVar);
    }
}
