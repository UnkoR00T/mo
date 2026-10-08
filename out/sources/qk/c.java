package qk;

import fk.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qk.a f167015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<C4198c> f167016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f167017c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ArrayList<C4198c> f167018a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qk.a f167019b = qk.a.f167012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f167020c = null;

        private boolean c(int i15) {
            Iterator<C4198c> it = this.f167018a.iterator();
            while (it.hasNext()) {
                if (it.next().a() == i15) {
                    return true;
                }
            }
            return false;
        }

        public b a(k kVar, int i15, String str, String str2) {
            ArrayList<C4198c> arrayList = this.f167018a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C4198c(kVar, i15, str, str2));
            return this;
        }

        public c b() throws GeneralSecurityException {
            if (this.f167018a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f167020c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f167019b, Collections.unmodifiableList(this.f167018a), this.f167020c);
            this.f167018a = null;
            return cVar;
        }

        public b d(qk.a aVar) {
            if (this.f167018a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f167019b = aVar;
            return this;
        }

        public b e(int i15) {
            if (this.f167018a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f167020c = Integer.valueOf(i15);
            return this;
        }
    }

    /* JADX INFO: renamed from: qk.c$c, reason: collision with other inner class name */
    public static final class C4198c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f167021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f167022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f167023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f167024d;

        public int a() {
            return this.f167022b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4198c)) {
                return false;
            }
            C4198c c4198c = (C4198c) obj;
            return this.f167021a == c4198c.f167021a && this.f167022b == c4198c.f167022b && this.f167023c.equals(c4198c.f167023c) && this.f167024d.equals(c4198c.f167024d);
        }

        public int hashCode() {
            return Objects.hash(this.f167021a, Integer.valueOf(this.f167022b), this.f167023c, this.f167024d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f167021a, Integer.valueOf(this.f167022b), this.f167023c, this.f167024d);
        }

        private C4198c(k kVar, int i15, String str, String str2) {
            this.f167021a = kVar;
            this.f167022b = i15;
            this.f167023c = str;
            this.f167024d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f167015a.equals(cVar.f167015a) && this.f167016b.equals(cVar.f167016b) && Objects.equals(this.f167017c, cVar.f167017c);
    }

    public int hashCode() {
        return Objects.hash(this.f167015a, this.f167016b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f167015a, this.f167016b, this.f167017c);
    }

    private c(qk.a aVar, List<C4198c> list, Integer num) {
        this.f167015a = aVar;
        this.f167016b = list;
        this.f167017c = num;
    }
}
