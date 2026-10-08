package vf3;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lvf3/c;", "", "a", "b", "Lvf3/c$a;", "Lvf3/c$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvf3/c$a;", "Lvf3/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f206481a = new a();

        private a() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1441531580;
        }

        public String toString() {
            return "Initial";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lvf3/c$b;", "Lvf3/c;", "Lvf3/b;", "formData", "<init>", "(Lvf3/b;)V", "a", "(Lvf3/b;)Lvf3/c$b;", "Lvf3/b;", "b", "()Lvf3/b;", "Lvf3/c$b$a;", "Lvf3/c$b$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f206482b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final FormData formData;

        /* JADX INFO: renamed from: vf3.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvf3/c$b$a;", "Lvf3/c$b;", "Lvf3/b;", "formData", "<init>", "(Lvf3/b;)V", "c", "(Lvf3/b;)Lvf3/c$b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvf3/b;", "b", "()Lvf3/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f206484d;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            static {
                int i15 = iy.b0.f97726c;
                int i16 = hz.b.f86845b;
                int i17 = PhoneNumber.f221634d;
                f206484d = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i17 | i16 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16 | i17 | i16 | i16;
            }

            public Loading(FormData formData) {
                super(formData, null);
                this.formData = formData;
            }

            @Override // vf3.c.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public final Loading c(FormData formData) {
                return new Loading(formData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && fr.t.c(this.formData, ((Loading) other).formData);
            }

            public int hashCode() {
                return this.formData.hashCode();
            }

            public String toString() {
                return "Loading(formData=" + this.formData + ')';
            }
        }

        /* JADX INFO: renamed from: vf3.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvf3/c$b$b;", "Lvf3/c$b;", "Lvf3/b;", "formData", "<init>", "(Lvf3/b;)V", "c", "(Lvf3/b;)Lvf3/c$b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lvf3/b;", "b", "()Lvf3/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NotLoading extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f206486d;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final FormData formData;

            static {
                int i15 = iy.b0.f97726c;
                int i16 = hz.b.f86845b;
                int i17 = PhoneNumber.f221634d;
                f206486d = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i17 | i16 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16 | i17 | i16 | i16;
            }

            public NotLoading(FormData formData) {
                super(formData, null);
                this.formData = formData;
            }

            @Override // vf3.c.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public FormData getFormData() {
                return this.formData;
            }

            public final NotLoading c(FormData formData) {
                return new NotLoading(formData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NotLoading) && fr.t.c(this.formData, ((NotLoading) other).formData);
            }

            public int hashCode() {
                return this.formData.hashCode();
            }

            public String toString() {
                return "NotLoading(formData=" + this.formData + ')';
            }
        }

        static {
            int i15 = iy.b0.f97726c;
            int i16 = hz.b.f86845b;
            f206482b = i15 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i15 | i16 | i16 | PhoneNumber.f221634d | i16 | i16;
        }

        public /* synthetic */ b(FormData formData, fr.k kVar) {
            this(formData);
        }

        public final b a(FormData formData) {
            if (this instanceof Loading) {
                return ((Loading) this).c(formData);
            }
            if (this instanceof NotLoading) {
                return ((NotLoading) this).c(formData);
            }
            throw new oq.p();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public FormData getFormData() {
            return this.formData;
        }

        private b(FormData formData) {
            this.formData = formData;
        }
    }
}
