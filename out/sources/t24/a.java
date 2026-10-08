package t24;

import dx.b;
import dx.j;
import er0.h;
import ex.d;
import f24.c;
import f24.i;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import px.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf24/i;", "Ldx/i;", "Ldx/b;", "Lf24/c;", "a", "(Lf24/i;)Ldx/i;", "Ler0/h;", "Lf24/h;", "b", "(Ler0/h;)Lf24/h;", "containers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: t24.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C4863a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f187203b;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.REFUGEE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.STUDENT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f187202a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.EXPIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[h.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[h.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[h.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f187203b = iArr2;
        }
    }

    public static final dx.i<b, c> a(i iVar) {
        Object objB;
        c cVar;
        j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C4863a.f187202a[iVar.ordinal()];
                    if (i15 == 1) {
                        cVar = c.CITIZEN;
                    } else if (i15 == 2) {
                        cVar = c.REFUGEE;
                    } else {
                        if (i15 != 3) {
                            aVar.b(new b.Generic(new UnsupportedOperationException(iVar + " is not a certificate issuer")));
                            throw new g();
                        }
                        cVar = c.UNIVERSITY;
                    }
                    return new dx.i.Right(cVar);
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final f24.h b(h hVar) {
        int i15 = C4863a.f187203b[hVar.ordinal()];
        if (i15 == 1) {
            return f24.h.EXPIRED;
        }
        if (i15 == 2) {
            return f24.h.INACTIVE;
        }
        if (i15 == 3) {
            return f24.h.REVOKED;
        }
        if (i15 != 4 && i15 != 5) {
            throw new p();
        }
        return f24.h.ACTIVE;
    }
}
