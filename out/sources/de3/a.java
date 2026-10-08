package de3;

import fr.t;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lde3/a;", "Lgz/a;", "Lde3/a$a;", "Ldx/b$c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "b", "(Lde3/a$a;)Ldx/b$c;", "a", "Lmx/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<InterfaceC0924a, dx.b.Business> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: de3.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lde3/a$a;", "Lgz/b$a;", "c", "a", "b", "Lde3/a$a$a;", "Lde3/a$a$b;", "Lde3/a$a$c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC0924a extends gz.b.a {

        /* JADX INFO: renamed from: de3.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lde3/a$a$a;", "Lde3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0925a implements InterfaceC0924a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0925a f41291a = new C0925a();

            private C0925a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0925a);
            }

            public int hashCode() {
                return -1711099501;
            }

            public String toString() {
                return "MultipleImages";
            }
        }

        /* JADX INFO: renamed from: de3.a$a$b */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lde3/a$a$b;", "Lde3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements InterfaceC0924a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f41292a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1697557735;
            }

            public String toString() {
                return "Pdf";
            }
        }

        /* JADX INFO: renamed from: de3.a$a$c */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lde3/a$a$c;", "Lde3/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements InterfaceC0924a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f41293a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 252631272;
            }

            public String toString() {
                return "SingleImage";
            }
        }
    }

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    public dx.b.Business b(InterfaceC0924a params) {
        Label labelC;
        mx.c cVar = this.labelProvider;
        if (t.c(params, InterfaceC0924a.c.f41293a)) {
            labelC = cVar.c(md3.b.E2);
        } else if (t.c(params, InterfaceC0924a.C0925a.f41291a)) {
            labelC = cVar.c(md3.b.C2);
        } else {
            if (!t.c(params, InterfaceC0924a.b.f41292a)) {
                throw new p();
            }
            labelC = cVar.c(md3.b.D2);
        }
        return new dx.b.Business(null, null, labelC, cVar.c(md3.b.B2), null, cVar.c(md3.b.f125731h), null, 83, null);
    }
}
