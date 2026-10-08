package r02;

import android.net.Uri;
import bc4.q;
import dx.i;
import dx.j;
import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import wx.FilePickerMetadata;
import zb4.FileSizeLimit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"$B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0012*\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u0018J$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010*¨\u0006+"}, d2 = {"Lr02/d;", "", "Lr02/d$a;", "Lr02/d$b;", "Lzz/b;", "pickFileManager", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "Lbc4/q;", "validatePickedFilesSizeUC", "Lr02/b;", "createFileHandlerUC", "Lr02/g;", "validateFileExtensionUC", "<init>", "(Lzz/b;Laz/f;Lmx/c;Lbc4/q;Lr02/b;Lr02/g;)V", "", "h", "(Ljava/lang/String;)Ljava/lang/String;", "g", "Ldx/b$c;", "k", "()Ldx/b$c;", "j", "e", "f", "d", "params", "Ldx/i;", "Ldx/b;", "i", "(Lr02/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lzz/b;", "b", "Laz/f;", "c", "Lmx/c;", "Lbc4/q;", "Lr02/b;", "Lr02/g;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zz.b pickFileManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q validatePickedFilesSizeUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b createFileHandlerUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g validateFileExtensionUC;

    /* JADX INFO: renamed from: r02.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr02/d$a;", "Lgz/b$a;", "", "maxAllFilesSizeInBytes", "maxSizeInBytes", "", "Lm02/c;", "alreadyAddedFiles", "<init>", "(FFLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "c", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxAllFilesSizeInBytes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxSizeInBytes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<m02.c> alreadyAddedFiles;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(float f15, float f16, List<? extends m02.c> list) {
            this.maxAllFilesSizeInBytes = f15;
            this.maxSizeInBytes = f16;
            this.alreadyAddedFiles = list;
        }

        public final List<m02.c> a() {
            return this.alreadyAddedFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getMaxAllFilesSizeInBytes() {
            return this.maxAllFilesSizeInBytes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMaxSizeInBytes() {
            return this.maxSizeInBytes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Float.compare(this.maxAllFilesSizeInBytes, params.maxAllFilesSizeInBytes) == 0 && Float.compare(this.maxSizeInBytes, params.maxSizeInBytes) == 0 && t.c(this.alreadyAddedFiles, params.alreadyAddedFiles);
        }

        public int hashCode() {
            return (((Float.hashCode(this.maxAllFilesSizeInBytes) * 31) + Float.hashCode(this.maxSizeInBytes)) * 31) + this.alreadyAddedFiles.hashCode();
        }

        public String toString() {
            return "Params(maxAllFilesSizeInBytes=" + this.maxAllFilesSizeInBytes + ", maxSizeInBytes=" + this.maxSizeInBytes + ", alreadyAddedFiles=" + this.alreadyAddedFiles + ')';
        }
    }

    /* JADX INFO: renamed from: r02.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr02/d$b;", "", "Lzz/a;", "file", "<init>", "(Lzz/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzz/a;", "()Lzz/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zz.a file;

        public Result(zz.a aVar) {
            this.file = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zz.a getFile() {
            return this.file;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.file, ((Result) other).file);
        }

        public int hashCode() {
            return this.file.hashCode();
        }

        public String toString() {
            return "Result(file=" + this.file + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {
        float A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170146f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170147g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170148h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170149j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f170150k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f170151l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f170152m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f170153n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f170154p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f170155q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f170156r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f170157s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f170158t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f170159v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f170160w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f170161x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f170162y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f170163z;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return d.this.i(null, this);
        }
    }

    public d(zz.b bVar, az.f fVar, mx.c cVar, q qVar, b bVar2, g gVar) {
        this.pickFileManager = bVar;
        this.fileDataManager = fVar;
        this.labelProvider = cVar;
        this.validatePickedFilesSizeUC = qVar;
        this.createFileHandlerUC = bVar2;
        this.validateFileExtensionUC = gVar;
    }

    private final dx.b.Business d() {
        return new dx.b.Business(zb4.b.ACTIVITY_NOT_FOUND, null, this.labelProvider.c(e02.a.f46646z), this.labelProvider.c(e02.a.f46503b0), null, this.labelProvider.c(e02.a.f46550j), null, 82, null);
    }

    private final dx.b.Business e() {
        return new dx.b.Business(zb4.b.EMPTY_FILE, null, this.labelProvider.c(e02.a.G), this.labelProvider.c(e02.a.f46502b), null, this.labelProvider.c(e02.a.f46550j), null, 82, null);
    }

    private final dx.b.Business f() {
        return new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(e02.a.F), this.labelProvider.c(e02.a.E), null, this.labelProvider.c(e02.a.f46550j), null, 82, null);
    }

    private final String g(String str) {
        return r.i1(str, ".", "");
    }

    private final String h(String str) {
        return r.s1(str, ".", null, 2, null);
    }

    private final dx.b.Business j() {
        return new dx.b.Business(zb4.b.NO_FILE_PICKED, null, Label.INSTANCE.c(), null, null, this.labelProvider.c(e02.a.f46550j), null, 90, null);
    }

    private final dx.b.Business k() {
        return new dx.b.Business(zb4.b.FILE_DATA_ERROR, null, this.labelProvider.c(e02.a.D0), null, null, this.labelProvider.c(e02.a.f46550j), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x032f A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0360  */
    /* JADX WARN: Code duplicated, block: B:103:0x0363 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0367 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:112:0x0402 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0409 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x040f A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x041c A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0429 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0436 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0447 A[Catch: Exception -> 0x014a, c -> 0x014e, CancellationException -> 0x0152, TRY_ENTER, TryCatch #13 {c -> 0x014e, CancellationException -> 0x0152, Exception -> 0x014a, blocks: (B:39:0x0139, B:74:0x0233, B:123:0x0447, B:124:0x0453), top: B:164:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:154:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:155:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:157:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:160:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:172:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0233 A[Catch: Exception -> 0x014a, c -> 0x014e, CancellationException -> 0x0152, TRY_ENTER, TRY_LEAVE, TryCatch #13 {c -> 0x014e, CancellationException -> 0x0152, Exception -> 0x014a, blocks: (B:39:0x0139, B:74:0x0233, B:123:0x0447, B:124:0x0453), top: B:164:0x0139 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x026d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0284 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c6 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x02d1 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x02dd A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02e9 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02f3 A[Catch: Exception -> 0x006a, c -> 0x006d, CancellationException -> 0x0070, TryCatch #3 {Exception -> 0x006a, blocks: (B:16:0x0065, B:109:0x03e6, B:110:0x03fa, B:112:0x0402, B:138:0x046e, B:139:0x047a, B:145:0x0492, B:148:0x04a0, B:85:0x02c6, B:87:0x02d1, B:89:0x02dd, B:100:0x032f, B:103:0x0363, B:105:0x0367, B:113:0x0409, B:114:0x040e, B:115:0x040f, B:116:0x041b, B:92:0x02e9, B:93:0x02ed, B:95:0x02f3, B:117:0x041c, B:118:0x0428, B:119:0x0429, B:120:0x0435, B:36:0x00fb, B:78:0x027c, B:80:0x0284, B:121:0x0436, B:122:0x0446, B:57:0x0194), top: B:163:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x032a A[LOOP:0: B:93:0x02ed->B:98:0x032a, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x02f3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    public Object i(Params params, tq.e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        ex.b bVar;
        ex.b bVar2;
        Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zz.e eVar2;
        Uri uri;
        int i25;
        int i26;
        Params params3;
        ex.b bVar3;
        ?? r15;
        zz.e eVar3;
        ex.b bVar4;
        int i27;
        int i28;
        String str;
        zz.e eVar4;
        Params params4;
        Object objF;
        int i29;
        ?? r16;
        zz.e eVar5;
        int i35;
        Uri uri2;
        String str2;
        int i36;
        ex.b bVar5;
        Params params5;
        i iVar;
        ex.b bVar6;
        Params params6;
        Uri uri3;
        ex.b bVar7;
        ex.b bVar8;
        Params params7;
        ?? r17;
        float fFloatValue;
        List<m02.c> listA;
        ex.b bVar9;
        Iterator it;
        m02.c cVar2;
        Iterator it4;
        boolean z15;
        zz.e eVar6;
        int i37;
        i<? extends dx.b, ? extends i0> iVarA2;
        ex.b bVar10;
        ex.b bVar11;
        ex.b bVar12;
        Result result;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i38 = cVar.D;
            if ((i38 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.D = i38 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objK = cVar.B;
        Object objE = uq.b.e();
        int i39 = cVar.D;
        ?? r18 = 4;
        try {
            try {
                try {
                    try {
                        try {
                            if (i39 == 0) {
                                u.b(objK);
                                j<dx.b> jVarA = xw.c.f221622a.a();
                                ex.a aVar = new ex.a();
                                zz.b bVar13 = this.pickFileManager;
                                List<? extends wx.f> listF1 = v.f1(g.INSTANCE.a().values());
                                cVar.f170144d = params;
                                cVar.f170145e = jVarA;
                                cVar.f170146f = vq.j.a(aVar);
                                cVar.f170147g = aVar;
                                cVar.f170156r = 0;
                                cVar.f170157s = 0;
                                cVar.f170158t = 0;
                                cVar.f170159v = 0;
                                cVar.f170160w = 0;
                                cVar.D = 1;
                                Object objI = bVar13.i(listF1, cVar);
                                if (objI != objE) {
                                    bVar = aVar;
                                    bVar2 = bVar;
                                    objK = objI;
                                    params2 = params;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    r18 = jVarA;
                                }
                                return objE;
                            }
                            if (i39 == 1) {
                                int i45 = cVar.f170160w;
                                int i46 = cVar.f170159v;
                                int i47 = cVar.f170158t;
                                int i48 = cVar.f170157s;
                                int i49 = cVar.f170156r;
                                ex.b bVar14 = (ex.b) cVar.f170147g;
                                ex.b bVar15 = (ex.b) cVar.f170146f;
                                j jVar = (j) cVar.f170145e;
                                params2 = (Params) cVar.f170144d;
                                try {
                                    u.b(objK);
                                    i16 = i45;
                                    i15 = i46;
                                    i17 = i47;
                                    r18 = jVar;
                                    bVar = bVar14;
                                    i18 = i48;
                                    bVar2 = bVar15;
                                    i19 = i49;
                                } catch (ex.c e15) {
                                    e = e15;
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r18 = jVar;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof i.Right) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } else {
                                if (i39 != 2) {
                                    if (i39 == 3) {
                                        int i55 = cVar.f170161x;
                                        int i56 = cVar.f170160w;
                                        int i57 = cVar.f170159v;
                                        int i58 = cVar.f170158t;
                                        int i59 = cVar.f170157s;
                                        int i65 = cVar.f170156r;
                                        String str3 = (String) cVar.f170150k;
                                        Uri uri4 = (Uri) cVar.f170149j;
                                        eVar5 = (zz.e) cVar.f170148h;
                                        ex.b bVar16 = (ex.b) cVar.f170147g;
                                        ex.b bVar17 = (ex.b) cVar.f170146f;
                                        j jVar2 = (j) cVar.f170145e;
                                        params5 = (Params) cVar.f170144d;
                                        u.b(objK);
                                        i28 = i55;
                                        uri2 = uri4;
                                        i35 = i65;
                                        bVar5 = bVar17;
                                        bVar4 = bVar16;
                                        str2 = str3;
                                        i36 = i59;
                                        i26 = i58;
                                        i25 = i57;
                                        i29 = i56;
                                        r16 = jVar2;
                                        iVar = (i) objK;
                                        bVar6 = bVar5;
                                        if (iVar instanceof i.Left) {
                                            bVar4.b((dx.b) ((i.Left) iVar).b());
                                            throw new oq.g();
                                        }
                                        az.f fVar2 = this.fileDataManager;
                                        String string = uri2.toString();
                                        cVar.f170144d = params5;
                                        cVar.f170145e = r16;
                                        params6 = params5;
                                        cVar.f170146f = vq.j.a(bVar6);
                                        cVar.f170147g = bVar4;
                                        cVar.f170148h = vq.j.a(eVar5);
                                        Uri uri5 = uri2;
                                        cVar.f170149j = uri5;
                                        cVar.f170150k = bVar4;
                                        cVar.f170151l = str2;
                                        cVar.f170156r = i35;
                                        cVar.f170157s = i36;
                                        cVar.f170158t = i26;
                                        cVar.f170159v = i25;
                                        cVar.f170160w = i29;
                                        cVar.f170161x = i28;
                                        uri3 = uri5;
                                        cVar.D = 4;
                                        objK = fVar2.k(string, cVar);
                                        if (objK == objE) {
                                            return objE;
                                        }
                                        bVar7 = bVar4;
                                        bVar8 = bVar6;
                                        params7 = params6;
                                        if (objK != null) {
                                            r17 = r16;
                                            bVar7.b(k());
                                            throw new oq.g();
                                        }
                                        r17 = r16;
                                        fFloatValue = ((Number) objK).floatValue();
                                        if (fFloatValue != 0.0f) {
                                            bVar4.b(e());
                                            throw new oq.g();
                                        }
                                        listA = params7.a();
                                        bVar9 = bVar8;
                                        if (!(listA instanceof Collection)) {
                                            it = listA.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z15 = false;
                                                    break;
                                                }
                                                cVar2 = (m02.c) it.next();
                                                it4 = it;
                                                if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                    z15 = true;
                                                    break;
                                                }
                                                it = it4;
                                            }
                                        } else {
                                            it = listA.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    z15 = false;
                                                    break;
                                                }
                                                cVar2 = (m02.c) it.next();
                                                it4 = it;
                                                if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                    z15 = true;
                                                    break;
                                                }
                                                it = it4;
                                            }
                                        }
                                        if (!z15) {
                                            bVar4.b(f());
                                            throw new oq.g();
                                        }
                                        eVar6 = eVar5;
                                        i37 = i28;
                                        iVarA2 = this.validatePickedFilesSizeUC.a(new q.Params(new FileSizeLimit(m02.d.c(params7.a()), params7.getMaxAllFilesSizeInBytes()), new FileSizeLimit(fFloatValue, params7.getMaxSizeInBytes())));
                                        if (iVarA2 instanceof i.Left) {
                                            bVar = bVar4;
                                        } else {
                                            if (iVarA2 instanceof i.Right) {
                                                throw new p();
                                            }
                                            i0 i0Var = (i0) ((i.Right) iVarA2).b();
                                            FilePickerMetadata filePickerMetadata = new FilePickerMetadata(h(str2), g(str2), fFloatValue, uri3.toString());
                                            b bVar18 = this.createFileHandlerUC;
                                            b.Params params8 = new b.Params(filePickerMetadata);
                                            cVar.f170144d = vq.j.a(params7);
                                            cVar.f170145e = r17;
                                            cVar.f170146f = vq.j.a(bVar9);
                                            cVar.f170147g = bVar4;
                                            cVar.f170148h = vq.j.a(eVar6);
                                            cVar.f170149j = vq.j.a(uri3);
                                            cVar.f170150k = vq.j.a(iVarA2);
                                            cVar.f170151l = bVar4;
                                            cVar.f170152m = vq.j.a(str2);
                                            cVar.f170153n = vq.j.a(i0Var);
                                            cVar.f170154p = vq.j.a(filePickerMetadata);
                                            cVar.f170155q = bVar4;
                                            cVar.f170156r = i35;
                                            cVar.f170157s = i36;
                                            cVar.f170158t = i26;
                                            cVar.f170159v = i25;
                                            cVar.f170160w = i29;
                                            cVar.f170161x = i37;
                                            cVar.A = fFloatValue;
                                            cVar.f170162y = 0;
                                            cVar.f170163z = 0;
                                            cVar.D = 5;
                                            objK = bVar18.d(params8, cVar);
                                            if (objK == objE) {
                                                return objE;
                                            }
                                            bVar10 = bVar4;
                                            bVar11 = bVar10;
                                            bVar12 = bVar11;
                                        }
                                        result = (Result) bVar4.a(iVarA2);
                                        if (result != null) {
                                            return new i.Right(result);
                                        }
                                        bVar.b(j());
                                        throw new oq.g();
                                    }
                                    if (i39 == 4) {
                                        int i66 = cVar.f170161x;
                                        int i67 = cVar.f170160w;
                                        int i68 = cVar.f170159v;
                                        int i69 = cVar.f170158t;
                                        i36 = cVar.f170157s;
                                        i35 = cVar.f170156r;
                                        String str4 = (String) cVar.f170151l;
                                        ex.b bVar19 = (ex.b) cVar.f170150k;
                                        Uri uri6 = (Uri) cVar.f170149j;
                                        zz.e eVar7 = (zz.e) cVar.f170148h;
                                        ex.b bVar20 = (ex.b) cVar.f170147g;
                                        bVar8 = (ex.b) cVar.f170146f;
                                        j jVar3 = (j) cVar.f170145e;
                                        Params params9 = (Params) cVar.f170144d;
                                        try {
                                            u.b(objK);
                                            i28 = i66;
                                            params7 = params9;
                                            bVar7 = bVar19;
                                            str2 = str4;
                                            eVar5 = eVar7;
                                            uri3 = uri6;
                                            bVar4 = bVar20;
                                            i26 = i69;
                                            i25 = i68;
                                            i29 = i67;
                                            r17 = jVar3;
                                            if (objK != null) {
                                                r17 = r16;
                                                bVar7.b(k());
                                                throw new oq.g();
                                            }
                                            r17 = r16;
                                            fFloatValue = ((Number) objK).floatValue();
                                            if (fFloatValue != 0.0f) {
                                                bVar4.b(e());
                                                throw new oq.g();
                                            }
                                            listA = params7.a();
                                            bVar9 = bVar8;
                                            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                                                it = listA.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    cVar2 = (m02.c) it.next();
                                                    it4 = it;
                                                    if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    it = it4;
                                                }
                                            } else {
                                                z15 = false;
                                                break;
                                            }
                                            if (!z15) {
                                                bVar4.b(f());
                                                throw new oq.g();
                                            }
                                            eVar6 = eVar5;
                                            i37 = i28;
                                            iVarA2 = this.validatePickedFilesSizeUC.a(new q.Params(new FileSizeLimit(m02.d.c(params7.a()), params7.getMaxAllFilesSizeInBytes()), new FileSizeLimit(fFloatValue, params7.getMaxSizeInBytes())));
                                            if (iVarA2 instanceof i.Left) {
                                                bVar = bVar4;
                                            } else {
                                                if (iVarA2 instanceof i.Right) {
                                                    throw new p();
                                                }
                                                i0 i0Var2 = (i0) ((i.Right) iVarA2).b();
                                                FilePickerMetadata filePickerMetadata2 = new FilePickerMetadata(h(str2), g(str2), fFloatValue, uri3.toString());
                                                b bVar110 = this.createFileHandlerUC;
                                                b.Params params10 = new b.Params(filePickerMetadata2);
                                                cVar.f170144d = vq.j.a(params7);
                                                cVar.f170145e = r17;
                                                cVar.f170146f = vq.j.a(bVar9);
                                                cVar.f170147g = bVar4;
                                                cVar.f170148h = vq.j.a(eVar6);
                                                cVar.f170149j = vq.j.a(uri3);
                                                cVar.f170150k = vq.j.a(iVarA2);
                                                cVar.f170151l = bVar4;
                                                cVar.f170152m = vq.j.a(str2);
                                                cVar.f170153n = vq.j.a(i0Var2);
                                                cVar.f170154p = vq.j.a(filePickerMetadata2);
                                                cVar.f170155q = bVar4;
                                                cVar.f170156r = i35;
                                                cVar.f170157s = i36;
                                                cVar.f170158t = i26;
                                                cVar.f170159v = i25;
                                                cVar.f170160w = i29;
                                                cVar.f170161x = i37;
                                                cVar.A = fFloatValue;
                                                cVar.f170162y = 0;
                                                cVar.f170163z = 0;
                                                cVar.D = 5;
                                                objK = bVar110.d(params10, cVar);
                                                if (objK == objE) {
                                                    return objE;
                                                }
                                                bVar10 = bVar4;
                                                bVar11 = bVar10;
                                                bVar12 = bVar11;
                                            }
                                            result = (Result) bVar4.a(iVarA2);
                                            if (result != null) {
                                                return new i.Right(result);
                                            }
                                            bVar.b(j());
                                            throw new oq.g();
                                        } catch (ex.c e18) {
                                            e = e18;
                                        } catch (CancellationException e19) {
                                            throw e19;
                                        } catch (Exception e25) {
                                            e = e25;
                                            r18 = jVar3;
                                            px.f fVar3 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar3.d(message, e, px.c.a(r18));
                                            iVarA = r18.a(e);
                                            if (iVarA instanceof i.Left) {
                                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                            } else {
                                                if (iVarA instanceof i.Right) {
                                                    throw new p();
                                                }
                                                objB = ((i.Right) iVarA).b();
                                            }
                                            return new i.Left(objB);
                                        }
                                    } else {
                                        if (i39 != 5) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        bVar10 = (ex.b) cVar.f170155q;
                                        bVar11 = (ex.b) cVar.f170151l;
                                        bVar12 = (ex.b) cVar.f170147g;
                                        u.b(objK);
                                    }
                                    iVarA2 = new i.Right<>(new Result((zz.a) bVar10.a((i) objK)));
                                    bVar4 = bVar11;
                                    bVar = bVar12;
                                    result = (Result) bVar4.a(iVarA2);
                                    if (result != null) {
                                        return new i.Right(result);
                                    }
                                    bVar.b(j());
                                    throw new oq.g();
                                }
                                int i75 = cVar.f170161x;
                                int i76 = cVar.f170160w;
                                int i77 = cVar.f170159v;
                                int i78 = cVar.f170158t;
                                int i79 = cVar.f170157s;
                                int i85 = cVar.f170156r;
                                ex.b bVar21 = (ex.b) cVar.f170150k;
                                Uri uri7 = (Uri) cVar.f170149j;
                                eVar3 = (zz.e) cVar.f170148h;
                                ex.b bVar22 = (ex.b) cVar.f170147g;
                                ex.b bVar23 = (ex.b) cVar.f170146f;
                                j jVar4 = (j) cVar.f170145e;
                                params3 = (Params) cVar.f170144d;
                                try {
                                    u.b(objK);
                                    bVar3 = bVar23;
                                    bVar4 = bVar22;
                                    uri = uri7;
                                    bVar = bVar21;
                                    i19 = i85;
                                    i18 = i79;
                                    i26 = i78;
                                    i25 = i77;
                                    i27 = i76;
                                    i28 = i75;
                                    r15 = jVar4;
                                    if (objK != null) {
                                        bVar.b(k());
                                        throw new oq.g();
                                    }
                                    str = (String) objK;
                                    g gVar = this.validateFileExtensionUC;
                                    eVar4 = eVar3;
                                    g.Params params11 = new g.Params(uri, str);
                                    cVar.f170144d = params3;
                                    cVar.f170145e = r15;
                                    params4 = params3;
                                    cVar.f170146f = vq.j.a(bVar3);
                                    cVar.f170147g = bVar4;
                                    cVar.f170148h = vq.j.a(eVar4);
                                    cVar.f170149j = uri;
                                    cVar.f170150k = str;
                                    cVar.f170156r = i19;
                                    cVar.f170157s = i18;
                                    cVar.f170158t = i26;
                                    cVar.f170159v = i25;
                                    cVar.f170160w = i27;
                                    cVar.f170161x = i28;
                                    cVar.D = 3;
                                    objF = gVar.f(params11, cVar);
                                    if (objF != objE) {
                                        ?? r19 = r15;
                                        i29 = i27;
                                        r16 = r19;
                                        eVar5 = eVar4;
                                        i35 = i19;
                                        uri2 = uri;
                                        str2 = str;
                                        objK = objF;
                                        i36 = i18;
                                        bVar5 = bVar3;
                                        params5 = params4;
                                        iVar = (i) objK;
                                        bVar6 = bVar5;
                                        if (iVar instanceof i.Left) {
                                            bVar4.b((dx.b) ((i.Left) iVar).b());
                                            throw new oq.g();
                                        }
                                        az.f fVar4 = this.fileDataManager;
                                        String string2 = uri2.toString();
                                        cVar.f170144d = params5;
                                        cVar.f170145e = r16;
                                        params6 = params5;
                                        cVar.f170146f = vq.j.a(bVar6);
                                        cVar.f170147g = bVar4;
                                        cVar.f170148h = vq.j.a(eVar5);
                                        Uri uri8 = uri2;
                                        cVar.f170149j = uri8;
                                        cVar.f170150k = bVar4;
                                        cVar.f170151l = str2;
                                        cVar.f170156r = i35;
                                        cVar.f170157s = i36;
                                        cVar.f170158t = i26;
                                        cVar.f170159v = i25;
                                        cVar.f170160w = i29;
                                        cVar.f170161x = i28;
                                        uri3 = uri8;
                                        cVar.D = 4;
                                        objK = fVar4.k(string2, cVar);
                                        if (objK == objE) {
                                            bVar7 = bVar4;
                                            bVar8 = bVar6;
                                            params7 = params6;
                                            if (objK != null) {
                                                r17 = r16;
                                                bVar7.b(k());
                                                throw new oq.g();
                                            }
                                            r17 = r16;
                                            fFloatValue = ((Number) objK).floatValue();
                                            if (fFloatValue != 0.0f) {
                                                bVar4.b(e());
                                                throw new oq.g();
                                            }
                                            listA = params7.a();
                                            bVar9 = bVar8;
                                            if (!(listA instanceof Collection)) {
                                                it = listA.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    cVar2 = (m02.c) it.next();
                                                    it4 = it;
                                                    if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    it = it4;
                                                }
                                            } else {
                                                it = listA.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    cVar2 = (m02.c) it.next();
                                                    it4 = it;
                                                    if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    it = it4;
                                                }
                                            }
                                            if (!z15) {
                                                bVar4.b(f());
                                                throw new oq.g();
                                            }
                                            eVar6 = eVar5;
                                            i37 = i28;
                                            iVarA2 = this.validatePickedFilesSizeUC.a(new q.Params(new FileSizeLimit(m02.d.c(params7.a()), params7.getMaxAllFilesSizeInBytes()), new FileSizeLimit(fFloatValue, params7.getMaxSizeInBytes())));
                                            if (iVarA2 instanceof i.Left) {
                                                bVar = bVar4;
                                            } else {
                                                if (iVarA2 instanceof i.Right) {
                                                    throw new p();
                                                }
                                                i0 i0Var3 = (i0) ((i.Right) iVarA2).b();
                                                FilePickerMetadata filePickerMetadata3 = new FilePickerMetadata(h(str2), g(str2), fFloatValue, uri3.toString());
                                                b bVar111 = this.createFileHandlerUC;
                                                b.Params params12 = new b.Params(filePickerMetadata3);
                                                cVar.f170144d = vq.j.a(params7);
                                                cVar.f170145e = r17;
                                                cVar.f170146f = vq.j.a(bVar9);
                                                cVar.f170147g = bVar4;
                                                cVar.f170148h = vq.j.a(eVar6);
                                                cVar.f170149j = vq.j.a(uri3);
                                                cVar.f170150k = vq.j.a(iVarA2);
                                                cVar.f170151l = bVar4;
                                                cVar.f170152m = vq.j.a(str2);
                                                cVar.f170153n = vq.j.a(i0Var3);
                                                cVar.f170154p = vq.j.a(filePickerMetadata3);
                                                cVar.f170155q = bVar4;
                                                cVar.f170156r = i35;
                                                cVar.f170157s = i36;
                                                cVar.f170158t = i26;
                                                cVar.f170159v = i25;
                                                cVar.f170160w = i29;
                                                cVar.f170161x = i37;
                                                cVar.A = fFloatValue;
                                                cVar.f170162y = 0;
                                                cVar.f170163z = 0;
                                                cVar.D = 5;
                                                objK = bVar111.d(params12, cVar);
                                                if (objK == objE) {
                                                    return objE;
                                                }
                                                bVar10 = bVar4;
                                                bVar11 = bVar10;
                                                bVar12 = bVar11;
                                                iVarA2 = new i.Right<>(new Result((zz.a) bVar10.a((i) objK)));
                                                bVar4 = bVar11;
                                                bVar = bVar12;
                                            }
                                            result = (Result) bVar4.a(iVarA2);
                                            if (result != null) {
                                                return new i.Right(result);
                                            }
                                            bVar.b(j());
                                            throw new oq.g();
                                        }
                                    }
                                    return objE;
                                } catch (ex.c e26) {
                                    e = e26;
                                } catch (CancellationException e27) {
                                    throw e27;
                                } catch (Exception e28) {
                                    e = e28;
                                    r18 = jVar4;
                                    px.f fVar5 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar5.d(message, e, px.c.a(r18));
                                    iVarA = r18.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (iVarA instanceof i.Right) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            }
                            if (t.c(eVar2, zz.e.a.f238544a)) {
                                bVar.b(d());
                                throw new oq.g();
                            }
                            if (!(eVar2 instanceof zz.e.UriResult)) {
                                throw new p();
                            }
                            uri = ((zz.e.UriResult) eVar2).getUri();
                            if (uri != null) {
                                az.f fVar6 = this.fileDataManager;
                                String string3 = uri.toString();
                                cVar.f170144d = params2;
                                cVar.f170145e = r18;
                                ?? r25 = r18;
                                cVar.f170146f = vq.j.a(bVar2);
                                cVar.f170147g = bVar;
                                cVar.f170148h = vq.j.a(eVar2);
                                cVar.f170149j = uri;
                                cVar.f170150k = bVar;
                                cVar.f170156r = i19;
                                cVar.f170157s = i18;
                                cVar.f170158t = i17;
                                cVar.f170159v = i15;
                                cVar.f170160w = i16;
                                cVar.f170161x = 0;
                                cVar.D = 2;
                                Object objF2 = fVar6.f(string3, cVar);
                                if (objF2 != objE) {
                                    i25 = i15;
                                    i26 = i17;
                                    params3 = params2;
                                    bVar3 = bVar2;
                                    r15 = r25;
                                    eVar3 = eVar2;
                                    objK = objF2;
                                    bVar4 = bVar;
                                    i27 = i16;
                                    i28 = 0;
                                    if (objK != null) {
                                        bVar.b(k());
                                        throw new oq.g();
                                    }
                                    str = (String) objK;
                                    g gVar2 = this.validateFileExtensionUC;
                                    eVar4 = eVar3;
                                    g.Params params13 = new g.Params(uri, str);
                                    cVar.f170144d = params3;
                                    cVar.f170145e = r15;
                                    params4 = params3;
                                    cVar.f170146f = vq.j.a(bVar3);
                                    cVar.f170147g = bVar4;
                                    cVar.f170148h = vq.j.a(eVar4);
                                    cVar.f170149j = uri;
                                    cVar.f170150k = str;
                                    cVar.f170156r = i19;
                                    cVar.f170157s = i18;
                                    cVar.f170158t = i26;
                                    cVar.f170159v = i25;
                                    cVar.f170160w = i27;
                                    cVar.f170161x = i28;
                                    cVar.D = 3;
                                    objF = gVar2.f(params13, cVar);
                                    if (objF != objE) {
                                        ?? r110 = r15;
                                        i29 = i27;
                                        r16 = r110;
                                        eVar5 = eVar4;
                                        i35 = i19;
                                        uri2 = uri;
                                        str2 = str;
                                        objK = objF;
                                        i36 = i18;
                                        bVar5 = bVar3;
                                        params5 = params4;
                                        iVar = (i) objK;
                                        bVar6 = bVar5;
                                        if (iVar instanceof i.Left) {
                                            bVar4.b((dx.b) ((i.Left) iVar).b());
                                            throw new oq.g();
                                        }
                                        az.f fVar7 = this.fileDataManager;
                                        String string4 = uri2.toString();
                                        cVar.f170144d = params5;
                                        cVar.f170145e = r16;
                                        params6 = params5;
                                        cVar.f170146f = vq.j.a(bVar6);
                                        cVar.f170147g = bVar4;
                                        cVar.f170148h = vq.j.a(eVar5);
                                        Uri uri9 = uri2;
                                        cVar.f170149j = uri9;
                                        cVar.f170150k = bVar4;
                                        cVar.f170151l = str2;
                                        cVar.f170156r = i35;
                                        cVar.f170157s = i36;
                                        cVar.f170158t = i26;
                                        cVar.f170159v = i25;
                                        cVar.f170160w = i29;
                                        cVar.f170161x = i28;
                                        uri3 = uri9;
                                        cVar.D = 4;
                                        objK = fVar7.k(string4, cVar);
                                        if (objK == objE) {
                                            bVar7 = bVar4;
                                            bVar8 = bVar6;
                                            params7 = params6;
                                            if (objK != null) {
                                                r17 = r16;
                                                bVar7.b(k());
                                                throw new oq.g();
                                            }
                                            r17 = r16;
                                            fFloatValue = ((Number) objK).floatValue();
                                            if (fFloatValue != 0.0f) {
                                                bVar4.b(e());
                                                throw new oq.g();
                                            }
                                            listA = params7.a();
                                            bVar9 = bVar8;
                                            if (!(listA instanceof Collection)) {
                                                it = listA.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    cVar2 = (m02.c) it.next();
                                                    it4 = it;
                                                    if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    it = it4;
                                                }
                                            } else {
                                                it = listA.iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    cVar2 = (m02.c) it.next();
                                                    it4 = it;
                                                    if (t.c(cVar2.getMetadata().getName() + '.' + cVar2.getMetadata().getExtension(), str2)) {
                                                        z15 = true;
                                                        break;
                                                    }
                                                    it = it4;
                                                }
                                            }
                                            if (!z15) {
                                                bVar4.b(f());
                                                throw new oq.g();
                                            }
                                            eVar6 = eVar5;
                                            i37 = i28;
                                            iVarA2 = this.validatePickedFilesSizeUC.a(new q.Params(new FileSizeLimit(m02.d.c(params7.a()), params7.getMaxAllFilesSizeInBytes()), new FileSizeLimit(fFloatValue, params7.getMaxSizeInBytes())));
                                            if (iVarA2 instanceof i.Left) {
                                                bVar = bVar4;
                                            } else {
                                                if (iVarA2 instanceof i.Right) {
                                                    throw new p();
                                                }
                                                i0 i0Var4 = (i0) ((i.Right) iVarA2).b();
                                                FilePickerMetadata filePickerMetadata4 = new FilePickerMetadata(h(str2), g(str2), fFloatValue, uri3.toString());
                                                b bVar112 = this.createFileHandlerUC;
                                                b.Params params14 = new b.Params(filePickerMetadata4);
                                                cVar.f170144d = vq.j.a(params7);
                                                cVar.f170145e = r17;
                                                cVar.f170146f = vq.j.a(bVar9);
                                                cVar.f170147g = bVar4;
                                                cVar.f170148h = vq.j.a(eVar6);
                                                cVar.f170149j = vq.j.a(uri3);
                                                cVar.f170150k = vq.j.a(iVarA2);
                                                cVar.f170151l = bVar4;
                                                cVar.f170152m = vq.j.a(str2);
                                                cVar.f170153n = vq.j.a(i0Var4);
                                                cVar.f170154p = vq.j.a(filePickerMetadata4);
                                                cVar.f170155q = bVar4;
                                                cVar.f170156r = i35;
                                                cVar.f170157s = i36;
                                                cVar.f170158t = i26;
                                                cVar.f170159v = i25;
                                                cVar.f170160w = i29;
                                                cVar.f170161x = i37;
                                                cVar.A = fFloatValue;
                                                cVar.f170162y = 0;
                                                cVar.f170163z = 0;
                                                cVar.D = 5;
                                                objK = bVar112.d(params14, cVar);
                                                if (objK == objE) {
                                                    return objE;
                                                }
                                                bVar10 = bVar4;
                                                bVar11 = bVar10;
                                                bVar12 = bVar11;
                                                iVarA2 = new i.Right<>(new Result((zz.a) bVar10.a((i) objK)));
                                                bVar4 = bVar11;
                                                bVar = bVar12;
                                            }
                                            result = (Result) bVar4.a(iVarA2);
                                            if (result != null) {
                                                return new i.Right(result);
                                            }
                                        }
                                    }
                                }
                                return objE;
                            }
                            bVar.b(j());
                            throw new oq.g();
                        } catch (ex.c e29) {
                            e = e29;
                        } catch (CancellationException e35) {
                            throw e35;
                        } catch (Exception e36) {
                            e = e36;
                            r18 = params;
                            px.f fVar8 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar8.d(message, e, px.c.a(r18));
                            iVarA = r18.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                        eVar2 = (zz.e) objK;
                    } catch (ex.c e37) {
                        e = e37;
                    } catch (CancellationException e38) {
                        throw e38;
                    } catch (Exception e39) {
                        e = e39;
                    }
                } catch (Exception e45) {
                    e = e45;
                }
            } catch (CancellationException e46) {
                throw e46;
            }
        } catch (ex.c e47) {
            e = e47;
        } catch (CancellationException e48) {
            throw e48;
        }
        return new i.Left((dx.b) ex.d.a(e));
    }
}
