package d8;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public static j0.b a(y7.f fVar, String str, byte[] bArr, Map<String, String> map) throws Throwable {
        y7.j jVar;
        y7.h hVar;
        y7.w wVar = new y7.w(fVar);
        y7.j jVarA = new y7.j.b().i(str).e(map).d(2).c(bArr).b(1).a();
        int i15 = 0;
        y7.j jVarA2 = jVarA;
        while (true) {
            try {
                y7.h hVar2 = new y7.h(wVar, jVarA2);
                try {
                    byte[] bArrB = bk.b.b(hVar2);
                    try {
                        jVar = jVarA;
                        hVar = hVar2;
                        try {
                            j0.b bVarC = new j0.b.a(bArrB).d(new h8.x(-1L, jVar, wVar.r(), wVar.s(), SystemClock.elapsedRealtime(), 0L, bArrB.length)).c();
                            o0.l(hVar);
                            return bVarC;
                        } catch (y7.s e15) {
                            e = e15;
                            try {
                                String strC = c(e, i15);
                                if (strC == null) {
                                    throw e;
                                }
                                i15++;
                                jVarA2 = jVarA2.a().i(strC).a();
                                try {
                                    o0.l(hVar);
                                    jVarA = jVar;
                                } catch (Exception e16) {
                                    e = e16;
                                    throw new k0(jVar, wVar.r(), wVar.f(), wVar.q(), e);
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                o0.l(hVar);
                                throw th;
                            }
                        }
                    } catch (y7.s e17) {
                        e = e17;
                        jVar = jVarA;
                        hVar = hVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        hVar = hVar2;
                        o0.l(hVar);
                        throw th;
                    }
                } catch (y7.s e18) {
                    e = e18;
                    hVar = hVar2;
                    jVar = jVarA;
                } catch (Throwable th6) {
                    th = th6;
                    hVar = hVar2;
                }
                jVarA = jVar;
            } catch (Exception e19) {
                e = e19;
                jVar = jVarA;
            }
        }
    }

    public static int b(Throwable th4, int i15) {
        if (th4 instanceof MediaDrm.MediaDrmStateException) {
            return o0.V(o0.W(((MediaDrm.MediaDrmStateException) th4).getDiagnosticInfo()));
        }
        if (th4 instanceof MediaDrmResetException) {
            return 6006;
        }
        if ((th4 instanceof NotProvisionedException) || d(th4)) {
            return 6002;
        }
        if (th4 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th4 instanceof l0) {
            return 6001;
        }
        if (th4 instanceof h.e) {
            return 6003;
        }
        if (th4 instanceof i0) {
            return 6008;
        }
        if (i15 == 1) {
            return 6006;
        }
        if (i15 == 2) {
            return 6004;
        }
        if (i15 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String c(y7.s sVar, int i15) {
        Map<String, List<String>> map;
        List<String> list;
        int i16 = sVar.f224933d;
        if ((i16 != 307 && i16 != 308) || i15 >= 5 || (map = sVar.f224935f) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean d(Throwable th4) {
        return Build.VERSION.SDK_INT == 34 && (th4 instanceof NoSuchMethodError) && th4.getMessage() != null && th4.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean e(Throwable th4) {
        return Build.VERSION.SDK_INT == 34 && (th4 instanceof NoSuchMethodError) && th4.getMessage() != null && th4.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
