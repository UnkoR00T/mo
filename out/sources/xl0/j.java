package xl0;

import al0.IdentityCardSuspensionData;
import al0.c0;
import al0.e0;
import gm0.PhysicalIdCardSuspensionInitResponse;
import gm0.o2;
import gm0.p2;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0001*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lgm0/s6;", "Ldx/i;", "Ldx/b;", "Lal0/f0;", "c", "(Lgm0/s6;)Ldx/i;", "Lal0/f0$a;", "a", "Lal0/c0;", "Lgm0/o2;", "d", "(Lal0/c0;)Lgm0/o2;", "Lgm0/p2;", "Lal0/e0;", "b", "(Lgm0/p2;)Ldx/i;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f219298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f219299c;

        static {
            int[] iArr = new int[o2.values().length];
            try {
                iArr[o2.SUSPENSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o2.CANCEL_SUSPENSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o2.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f219297a = iArr;
            int[] iArr2 = new int[c0.values().length];
            try {
                iArr2[c0.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c0.UNSUSPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f219298b = iArr2;
            int[] iArr3 = new int[p2.values().length];
            try {
                iArr3[p2.SUSPENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[p2.UNSUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[p2.UNSUSPENDED_WITH_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[p2.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f219299c = iArr3;
        }
    }

    private static final dx.i<dx.b, IdentityCardSuspensionData.a> a(PhysicalIdCardSuspensionInitResponse physicalIdCardSuspensionInitResponse) {
        int i15 = a.f219297a[physicalIdCardSuspensionInitResponse.getAllowedAction().ordinal()];
        if (i15 == 1) {
            return new dx.i.Right(IdentityCardSuspensionData.a.C0166a.f7353a);
        }
        if (i15 == 2) {
            return (physicalIdCardSuspensionInitResponse.getCancelSuspensionEndDate() == null || physicalIdCardSuspensionInitResponse.getSuspensionDate() == null) ? new dx.i.Left(new dx.b.Parsing(null, 1, null)) : new dx.i.Right(new IdentityCardSuspensionData.a.Unsuspension(physicalIdCardSuspensionInitResponse.getSuspensionDate(), physicalIdCardSuspensionInitResponse.getCancelSuspensionEndDate()));
        }
        if (i15 == 3) {
            return new dx.i.Left(new dx.b.Generic(null, 1, null));
        }
        throw new p();
    }

    public static final dx.i<dx.b, e0> b(p2 p2Var) {
        Object objB;
        e0 e0Var;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f219299c[p2Var.ordinal()];
                    if (i15 == 1) {
                        e0Var = e0.SUSPENDED;
                    } else if (i15 == 2) {
                        e0Var = e0.UNSUSPENDED;
                    } else {
                        if (i15 != 3) {
                            if (i15 != 4) {
                                throw new p();
                            }
                            aVar.b(new dx.b.Generic(null, 1, null));
                            throw new oq.g();
                        }
                        e0Var = e0.UNSUSPENDED_WITH_LIMIT;
                    }
                    return new dx.i.Right(e0Var);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final dx.i<dx.b, IdentityCardSuspensionData> c(PhysicalIdCardSuspensionInitResponse physicalIdCardSuspensionInitResponse) {
        dx.i iVarA = a(physicalIdCardSuspensionInitResponse);
        if (iVarA instanceof dx.i.Left) {
            return iVarA;
        }
        if (!(iVarA instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(new IdentityCardSuspensionData((IdentityCardSuspensionData.a) ((dx.i.Right) iVarA).b(), iy.c0.g(physicalIdCardSuspensionInitResponse.getSeries() + physicalIdCardSuspensionInitResponse.getNumber())));
    }

    public static final o2 d(c0 c0Var) {
        int i15 = a.f219298b[c0Var.ordinal()];
        if (i15 == 1) {
            return o2.SUSPENSION;
        }
        if (i15 == 2) {
            return o2.CANCEL_SUSPENSION;
        }
        throw new p();
    }
}
