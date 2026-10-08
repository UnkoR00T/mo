package b92;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lb92/e;", "Lzx/d;", "Lb92/d$c;", "Lb92/e$a;", "Lxw/b;", "Lb92/d$c$a;", "g4", "()Lxw/b;", "backNavigation", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends zx.d<d.c, SetupData> {

    /* JADX INFO: renamed from: b92.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb92/e$a;", "", "Lfp0/k;", "violationTypeTag", "<init>", "(Lfp0/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp0/k;", "()Lfp0/k;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetupData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final fp0.k violationTypeTag;

        public SetupData(fp0.k kVar) {
            this.violationTypeTag = kVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fp0.k getViolationTypeTag() {
            return this.violationTypeTag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetupData) && fr.t.c(this.violationTypeTag, ((SetupData) other).violationTypeTag);
        }

        public int hashCode() {
            return this.violationTypeTag.hashCode();
        }

        public String toString() {
            return "SetupData(violationTypeTag=" + this.violationTypeTag + ')';
        }
    }

    xw.b<d.c.a> g4();
}
