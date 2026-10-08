package lv1;

import fr.k;
import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0012j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Llv1/a;", "", "", "id", "", "image", "contentDescription", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "I", "j", "()I", "c", "e", "d", "f", "g", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum a {
    ELECTRONIC_DIPLOMA_GRADUATION_QUALIFICATION_LEVEL_6("electronic_diploma_graduation_qualification_level_6", c20.b.f22703o1, dv1.a.f44668z),
    ELECTRONIC_DIPLOMA_GRADUATION_QUALIFICATION_LEVEL_7("electronic_diploma_graduation_qualification_level_7", c20.b.f22707p1, dv1.a.A),
    ELECTRONIC_DIPLOMA_PHD_QUALIFICATION_LEVEL_8("electronic_diploma_phd_qualification_level_8", c20.b.f22711q1, dv1.a.B);


    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int contentDescription;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ wq.a f120579j = wq.b.a(b());

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lv1.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Llv1/a$a;", "", "<init>", "()V", "", "value", "Llv1/a;", "a", "(Ljava/lang/String;)Llv1/a;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final a a(String value) {
            a next;
            Iterator<a> it = a.g().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (t.c(next.getId(), value)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    a(String str, int i15, int i16) {
        this.id = str;
        this.image = i15;
        this.contentDescription = i16;
    }

    public static wq.a<a> g() {
        return f120579j;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getContentDescription() {
        return this.contentDescription;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getImage() {
        return this.image;
    }
}
