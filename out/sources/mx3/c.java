package mx3;

import f00.SharedDestinationSpec;
import f00.r;
import iy.l;
import iy.w;
import lx3.p;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmx3/c;", "", "<init>", "()V", "Lmx/c;", "labelProvider", "Lox3/c;", "b", "(Lmx/c;)Lox3/c;", "Liy/w;", "secureRandomFactory", "Liy/a;", "base64Coder", "Liy/l;", CMSAttributeTableGenerator.DIGEST, "Lkx3/c;", "a", "(Liy/w;Liy/a;Liy/l;)Lkx3/c;", "keycloakauth_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    public c() {
        r.K().add(new SharedDestinationSpec(hx3.b.class, p.class, b.f129282a.b()));
    }

    public final kx3.c a(w secureRandomFactory, iy.a base64Coder, l digest) {
        return new kx3.c(secureRandomFactory, base64Coder, digest);
    }

    public final ox3.c b(mx.c labelProvider) {
        return new ox3.c(labelProvider);
    }
}
