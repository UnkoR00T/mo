package y34;

import k34.u;
import oq.p;
import p071kotlin.Metadata;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly34/c;", "Lxw/f;", "Lk34/u;", "Lrq0/b;", "<init>", "()V", "params", "Lrq0/b$d;", "c", "(Lk34/u;)Lrq0/b$d;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f<u, rq0.b> {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f223796a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.MOBYWATEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.DIIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.STUDENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f223796a = iArr;
        }
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public rq0.b.d b(u params) {
        int i15 = a.f223796a[params.ordinal()];
        if (i15 == 1) {
            return rq0.b.d.ID_CARD;
        }
        if (i15 == 2) {
            return rq0.b.d.DIIA_REFUGEE_CARD;
        }
        if (i15 == 3) {
            return rq0.b.d.STUDENT_CARD;
        }
        throw new p();
    }
}
