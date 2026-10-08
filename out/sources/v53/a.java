package v53;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\u0010BC\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\f\u0010\u0013\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lv53/a;", "", "Lv53/f;", "screenType", "", "successMessageLabel", "failureMessageLabel", "navigationTitle", "title", "description", "<init>", "(Lv53/f;IIIII)V", "a", "Lv53/f;", "d", "()Lv53/f;", "b", "I", "e", "()I", "c", "f", "Lv53/a$a;", "Lv53/a$b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f screenType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int successMessageLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int failureMessageLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int navigationTitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int title;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int description;

    /* JADX INFO: renamed from: v53.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv53/a$a;", "Lv53/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C5319a extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C5319a f204058g = new C5319a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f204059h = 8;

        private C5319a() {
            super(f.a.f204075a, c53.a.f23713n1, c53.a.f23741y, c53.a.f23738w0, c53.a.R0, c53.a.f23736v0, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C5319a);
        }

        public int hashCode() {
            return 688900469;
        }

        public String toString() {
            return "DisableLoginWithPin";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv53/a$b;", "Lv53/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f204060g = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f204061h = 8;

        private b() {
            super(f.c.f204077a, c53.a.f23716o1, c53.a.f23743z, c53.a.Q0, c53.a.R0, c53.a.P0, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -593701790;
        }

        public String toString() {
            return "EnableLoginWithPin";
        }
    }

    public /* synthetic */ a(f fVar, int i15, int i16, int i17, int i18, int i19, k kVar) {
        this(fVar, i15, i16, i17, i18, i19);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFailureMessageLabel() {
        return this.failureMessageLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final f getScreenType() {
        return this.screenType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSuccessMessageLabel() {
        return this.successMessageLabel;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    private a(f fVar, int i15, int i16, int i17, int i18, int i19) {
        this.screenType = fVar;
        this.successMessageLabel = i15;
        this.failureMessageLabel = i16;
        this.navigationTitle = i17;
        this.title = i18;
        this.description = i19;
    }
}
