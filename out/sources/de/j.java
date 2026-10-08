package de;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import ve.k;
import ve.l;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.h<zd.f, String> f41120a = new ve.h<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i6.f<b> f41121b = we.a.d(10, new a());

    class a implements we.a.d<b> {
        a() {
        }

        @Override // we.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance(XMSSKeyParameters.SHA_256));
            } catch (NoSuchAlgorithmException e15) {
                throw new RuntimeException(e15);
            }
        }
    }

    private static final class b implements we.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f41123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final we.c f41124b = we.c.a();

        b(MessageDigest messageDigest) {
            this.f41123a = messageDigest;
        }

        @Override // we.a.f
        public we.c b() {
            return this.f41124b;
        }
    }

    private String a(zd.f fVar) {
        b bVar = (b) k.d(this.f41121b.z());
        try {
            fVar.b(bVar.f41123a);
            return l.w(bVar.f41123a.digest());
        } finally {
            this.f41121b.A(bVar);
        }
    }

    public String b(zd.f fVar) {
        String strG;
        synchronized (this.f41120a) {
            strG = this.f41120a.g(fVar);
        }
        if (strG == null) {
            strG = a(fVar);
        }
        synchronized (this.f41120a) {
            this.f41120a.k(fVar, strG);
        }
        return strG;
    }
}
