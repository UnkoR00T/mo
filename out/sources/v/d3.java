package v;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f202541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Class<? extends c3>> f202542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Class<? extends c3>> f202543c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f202544a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<Class<? extends c3>> f202545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set<Class<? extends c3>> f202546c;

        public d3 a() {
            return new d3(this.f202544a, this.f202545b, this.f202546c);
        }

        public b b(Set<Class<? extends c3>> set) {
            this.f202546c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends c3>> set) {
            this.f202545b = new HashSet(set);
            return this;
        }

        public b d(boolean z15) {
            this.f202544a = z15;
            return this;
        }
    }

    public static d3 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends c3> cls, boolean z15) {
        if (this.f202542b.contains(cls)) {
            return true;
        }
        return !this.f202543c.contains(cls) && this.f202541a && z15;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        d3 d3Var = (d3) obj;
        return this.f202541a == d3Var.f202541a && Objects.equals(this.f202542b, d3Var.f202542b) && Objects.equals(this.f202543c, d3Var.f202543c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f202541a), this.f202542b, this.f202543c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f202541a + ", forceEnabledQuirks=" + this.f202542b + ", forceDisabledQuirks=" + this.f202543c + '}';
    }

    private d3(boolean z15, Set<Class<? extends c3>> set, Set<Class<? extends c3>> set2) {
        this.f202541a = z15;
        this.f202542b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f202543c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }
}
