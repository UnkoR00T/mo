package nc4;

import n3.o1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lnc4/a;", "Ll70/a;", "b", "a", "Lnc4/a$a;", "Lnc4/a$b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends l70.a {

    /* JADX INFO: renamed from: nc4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, d2 = {"Lnc4/a$a;", "Lnc4/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "c", "()J", "primary", "d", "onPrimary", "secondary", "e", "getOnSecondary-0d7_KjU", "onSecondary", "f", "a", "background", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C3336a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3336a f134224a = new C3336a();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long primary = o1.d(4283147775L);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final long onPrimary = o1.d(4279243543L);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long secondary = o1.d(4278855757L);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final long onSecondary = o1.d(4283147775L);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final long background = o1.d(4279243543L);

        private C3336a() {
        }

        @Override // l70.a
        public long a() {
            return background;
        }

        @Override // l70.a
        public long b() {
            return secondary;
        }

        @Override // l70.a
        public long c() {
            return primary;
        }

        @Override // l70.a
        public long d() {
            return onPrimary;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C3336a);
        }

        public int hashCode() {
            return 2068118054;
        }

        public String toString() {
            return "Dark";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u0006\u001e"}, d2 = {"Lnc4/a$b;", "Lnc4/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/graphics/Color;", "b", "J", "c", "()J", "primary", "d", "onPrimary", "secondary", "e", "getOnSecondary-0d7_KjU", "onSecondary", "f", "a", "background", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f134230a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final long primary = o1.d(4279656184L);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final long onPrimary = o1.d(BodyPartID.bodyIdMax);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final long secondary = o1.d(4293258493L);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final long onSecondary = o1.d(4279656184L);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final long background = o1.d(4294244091L);

        private b() {
        }

        @Override // l70.a
        public long a() {
            return background;
        }

        @Override // l70.a
        public long b() {
            return secondary;
        }

        @Override // l70.a
        public long c() {
            return primary;
        }

        @Override // l70.a
        public long d() {
            return onPrimary;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -305233818;
        }

        public String toString() {
            return "Light";
        }
    }
}
