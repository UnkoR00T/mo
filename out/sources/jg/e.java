package jg;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Account f102441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f102442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f102443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f102444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f102445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f102446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f102447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f102448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sh.a f102449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f102450j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Account f102451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private r0.b f102452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f102453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f102454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final sh.a f102455e = sh.a.f181638k;

        public e a() {
            return new e(this.f102451a, this.f102452b, null, 0, null, this.f102453c, this.f102454d, this.f102455e, false);
        }

        public a b(String str) {
            this.f102453c = str;
            return this;
        }

        public final a c(Account account) {
            this.f102451a = account;
            return this;
        }

        public final a d(Collection collection) {
            if (this.f102452b == null) {
                this.f102452b = new r0.b();
            }
            this.f102452b.addAll(collection);
            return this;
        }

        public final a e(String str) {
            this.f102454d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i15, View view, String str, String str2, sh.a aVar, boolean z15) {
        this.f102441a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f102442b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f102444d = map;
        this.f102446f = view;
        this.f102445e = i15;
        this.f102447g = str;
        this.f102448h = str2;
        this.f102449i = aVar == null ? sh.a.f181638k : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(((c0) it.next()).f102436a);
        }
        this.f102443c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f102441a;
    }

    public Account b() {
        Account account = this.f102441a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f102443c;
    }

    public String d() {
        return this.f102447g;
    }

    public Set<Scope> e() {
        return this.f102442b;
    }

    public final String f() {
        return this.f102448h;
    }

    public final sh.a g() {
        return this.f102449i;
    }

    public final Integer h() {
        return this.f102450j;
    }

    public final void i(Integer num) {
        this.f102450j = num;
    }
}
