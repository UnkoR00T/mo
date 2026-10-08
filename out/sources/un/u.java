package un;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<sn.k> f199306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<sn.f> f199307g = l.f199293a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(sn.k.f182457d);
        linkedHashSet.add(sn.k.f182458e);
        linkedHashSet.add(sn.k.f182459f);
        linkedHashSet.add(sn.k.f182460g);
        linkedHashSet.add(sn.k.f182461h);
        f199306f = Collections.unmodifiableSet(linkedHashSet);
    }

    protected u(SecretKey secretKey) {
        super(f199306f, l.f199293a, secretKey);
    }
}
