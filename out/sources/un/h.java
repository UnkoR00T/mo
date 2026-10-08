package un;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements sn.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f199282e = Collections.unmodifiableSet(new HashSet(Arrays.asList("AES", "ChaCha20")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<sn.k> f199283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<sn.f> f199284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wn.b f199285c = new wn.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SecretKey f199286d;

    public h(Set<sn.k> set, Set<sn.f> set2, SecretKey secretKey) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.f199283a = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.f199284b = set2;
        if (secretKey != null && set.size() > 1 && (secretKey.getAlgorithm() == null || !f199282e.contains(secretKey.getAlgorithm()))) {
            throw new IllegalArgumentException("The algorithm of the content encryption key (CEK) must be AES or ChaCha20");
        }
        this.f199286d = secretKey;
    }

    @Override // sn.p
    public Set<sn.f> a() {
        return this.f199284b;
    }

    @Override // sn.p
    public Set<sn.k> b() {
        return this.f199283a;
    }

    protected SecretKey d(sn.f fVar) {
        return (f() || fVar == null) ? this.f199286d : l.c(fVar, this.f199285c.b());
    }

    public wn.b e() {
        return this.f199285c;
    }

    protected boolean f() {
        return this.f199286d != null;
    }
}
