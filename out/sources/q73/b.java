package q73;

import hz.g;
import hz.h;
import hz.i;
import iy.b0;
import iy.c0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lq73/b;", "", "Lmx/c;", "labelProvider", "Lhz/i;", "validatorTextFactory", "<init>", "(Lmx/c;Lhz/i;)V", "Lfp0/h;", "qrCode", "Lhz/g;", "c", "(Liy/b0;)Lhz/g;", "Lhz/h;", "a", "Loq/k;", "b", "()Lhz/h;", "validator", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f165207b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f165208c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k validator;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq73/b$a;", "", "<init>", "()V", "", "STUDENT_CARD_QR_CODE_LENGTH", "I", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public b(final mx.c cVar, final i iVar) {
        this.validator = l.a(new er.a() { // from class: q73.a
            @Override // er.a
            public final Object a() {
                return b.d(iVar, cVar);
            }
        });
    }

    private final h b() {
        return (h) this.validator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h d(i iVar, mx.c cVar) {
        return iVar.a().M(cVar.c(n73.a.f133462i)).O(32, cVar.c(n73.a.f133464j)).y(32, cVar.c(n73.a.f133466k)).c(cVar.c(n73.a.f133464j)).d(cVar.c(n73.a.f133464j));
    }

    public final g c(b0 qrCode) {
        return b().a(c0.e(qrCode));
    }
}
