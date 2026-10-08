package xl0;

import al0.BEFileInfo;
import fr.t;
import gm0.FileV4Dto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxl0/l;", "Lxw/f;", "Lxl0/l$a;", "Lgm0/f2;", "Liy/a;", "base64Coder", "<init>", "(Liy/a;)V", "params", "c", "(Lxl0/l$a;)Lgm0/f2;", "a", "Liy/a;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, FileV4Dto> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: xl0.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxl0/l$a;", "", "Lwx/i;", "file", "Lal0/l$a;", "type", "<init>", "(Lwx/i;Lal0/l$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/i;", "()Lwx/i;", "b", "Lal0/l$a;", "()Lal0/l$a;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wx.i file;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEFileInfo.a type;

        public Params(wx.i iVar, BEFileInfo.a aVar) {
            this.file = iVar;
            this.type = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wx.i getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BEFileInfo.a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.file, params.file) && this.type == params.type;
        }

        public int hashCode() {
            return (this.file.hashCode() * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Params(file=" + this.file + ", type=" + this.type + ')';
        }
    }

    public l(iy.a aVar) {
        this.base64Coder = aVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileV4Dto b(Params params) {
        String name = params.getFile().getMetadata().getName();
        return new FileV4Dto(iy.a.e(this.base64Coder, params.getFile().getFileContent().getBytes(), null, 2, null), e.b(params.getType()), params.getFile().getMetadata().getExtension(), name);
    }
}
