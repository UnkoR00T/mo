package wd;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class b implements vd.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final g f212180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f212181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f212182c;

    public b(a aVar) {
        this(aVar, new c(PKIFailureInfo.certConfirmed));
    }

    @Override // vd.h
    public vd.k a(vd.n<?> nVar) {
        IOException iOException;
        f fVarA;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                fVarA = this.f212181b.a(nVar, e.c(nVar.s()));
                try {
                    int iD = fVarA.d();
                    List<vd.g> listC = fVarA.c();
                    if (iD == 304) {
                        return l.b(nVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = fVarA.a();
                    byte[] bArrC = inputStreamA != null ? l.c(inputStreamA, fVarA.b(), this.f212182c) : new byte[0];
                    try {
                        l.d(SystemClock.elapsedRealtime() - jElapsedRealtime, nVar, bArrC, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        return new vd.k(iD, bArrC, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e15) {
                        e = e15;
                        bArr = bArrC;
                        iOException = e;
                        l.a(nVar, l.e(nVar, iOException, jElapsedRealtime, fVarA, bArr));
                        nVar = nVar;
                    }
                } catch (IOException e16) {
                    e = e16;
                    bArr = null;
                }
            } catch (IOException e17) {
                iOException = e17;
                fVarA = null;
                bArr = null;
                nVar = nVar;
            }
            l.a(nVar, l.e(nVar, iOException, jElapsedRealtime, fVarA, bArr));
            nVar = nVar;
        }
    }

    public b(a aVar, c cVar) {
        this.f212181b = aVar;
        this.f212180a = aVar;
        this.f212182c = cVar;
    }
}
