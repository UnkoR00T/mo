package cm0;

import dx.i;
import dx.j;
import ex.d;
import gm0.PhysicalIdCardVerificationResponse;
import gm0.q2;
import java.util.concurrent.CancellationException;
import ll0.IdVerificationData;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import px.f;
import xw.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgm0/w6;", "Ldx/i;", "Ldx/b;", "Lll0/a;", "b", "(Lgm0/w6;)Ldx/i;", "Lgm0/q2;", "Lll0/a$a;", "a", "(Lgm0/q2;)Ldx/i;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28223a;

        static {
            int[] iArr = new int[q2.values().length];
            try {
                iArr[q2.INVALIDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q2.SUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q2.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q2.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28223a = iArr;
        }
    }

    private static final i<dx.b, IdVerificationData.EnumC2884a> a(q2 q2Var) {
        Object objB;
        IdVerificationData.EnumC2884a enumC2884a;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f28223a[q2Var.ordinal()];
                    if (i15 == 1) {
                        enumC2884a = IdVerificationData.EnumC2884a.INVALIDATED;
                    } else if (i15 == 2) {
                        enumC2884a = IdVerificationData.EnumC2884a.SUSPENDED;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Parsing(null, 1, null));
                            throw new g();
                        }
                        enumC2884a = IdVerificationData.EnumC2884a.NOT_FOUND;
                    }
                    return new i.Right(enumC2884a);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, IdVerificationData> b(PhysicalIdCardVerificationResponse physicalIdCardVerificationResponse) {
        i iVarA = a(physicalIdCardVerificationResponse.getStatus());
        if (iVarA instanceof i.Left) {
            return iVarA;
        }
        if (!(iVarA instanceof i.Right)) {
            throw new p();
        }
        return new i.Right(new IdVerificationData(physicalIdCardVerificationResponse.getTitle(), physicalIdCardVerificationResponse.getMessage(), (IdVerificationData.EnumC2884a) ((i.Right) iVarA).b()));
    }
}
