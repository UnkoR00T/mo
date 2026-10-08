package r02;

import android.net.Uri;
import bc4.q;
import dx.i;
import dx.j;
import er.l;
import fr.t;
import fu.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import wx.FilePickerMetadata;
import zb4.FileSizeLimit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003$&\"B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00142\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u0016J$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)¨\u0006+"}, d2 = {"Lr02/e;", "", "Lr02/e$b;", "Lr02/e$c;", "Lbc4/q;", "validatePickedFilesSize", "Lb00/g;", "mediaPickerManager", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "Lr02/b;", "createFileHandlerUC", "<init>", "(Lbc4/q;Lb00/g;Laz/f;Lmx/c;Lr02/b;)V", "Lwx/d;", "", "h", "(Ljava/lang/String;)Z", "Ldx/b$c;", "j", "()Ldx/b$c;", "i", "", "allowedExtensions", "e", "(Ljava/util/Set;)Ldx/b$c;", "d", "params", "Ldx/i;", "Ldx/b;", "g", "(Lr02/e$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/q;", "b", "Lb00/g;", "c", "Laz/f;", "Lmx/c;", "Lr02/b;", "f", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f170165g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<wx.d> f170166h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q validatePickedFilesSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b00.g mediaPickerManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b createFileHandlerUC;

    /* JADX INFO: renamed from: r02.e$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr02/e$b;", "Lgz/b$a;", "", "maxPhotoSizeInBytes", "maxAllPhotoSizeInBytes", "", "Lm02/c;", "alreadyAddedFiles", "<init>", "(FFLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxPhotoSizeInBytes;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxAllPhotoSizeInBytes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<m02.c> alreadyAddedFiles;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(float f15, float f16, List<? extends m02.c> list) {
            this.maxPhotoSizeInBytes = f15;
            this.maxAllPhotoSizeInBytes = f16;
            this.alreadyAddedFiles = list;
        }

        public final List<m02.c> a() {
            return this.alreadyAddedFiles;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getMaxAllPhotoSizeInBytes() {
            return this.maxAllPhotoSizeInBytes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMaxPhotoSizeInBytes() {
            return this.maxPhotoSizeInBytes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Float.compare(this.maxPhotoSizeInBytes, params.maxPhotoSizeInBytes) == 0 && Float.compare(this.maxAllPhotoSizeInBytes, params.maxAllPhotoSizeInBytes) == 0 && t.c(this.alreadyAddedFiles, params.alreadyAddedFiles);
        }

        public int hashCode() {
            return (((Float.hashCode(this.maxPhotoSizeInBytes) * 31) + Float.hashCode(this.maxAllPhotoSizeInBytes)) * 31) + this.alreadyAddedFiles.hashCode();
        }

        public String toString() {
            return "Params(maxPhotoSizeInBytes=" + this.maxPhotoSizeInBytes + ", maxAllPhotoSizeInBytes=" + this.maxAllPhotoSizeInBytes + ", alreadyAddedFiles=" + this.alreadyAddedFiles + ')';
        }
    }

    /* JADX INFO: renamed from: r02.e$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr02/e$c;", "", "Lzz/a;", "imageFile", "<init>", "(Lzz/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzz/a;", "()Lzz/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zz.a imageFile;

        public Result(zz.a aVar) {
            this.imageFile = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zz.a getImageFile() {
            return this.imageFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.imageFile, ((Result) other).imageFile);
        }

        public int hashCode() {
            return this.imageFile.hashCode();
        }

        public String toString() {
            return "Result(imageFile=" + this.imageFile + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements l<wx.d, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f170176a = new d();

        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ CharSequence b(wx.d dVar) {
            return c(dVar.getValue());
        }

        public final CharSequence c(String str) {
            return "\u200b." + str;
        }
    }

    /* JADX INFO: renamed from: r02.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4309e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170177d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170178e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170179f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170180g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170181h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170182j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f170183k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f170184l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f170185m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f170186n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170187p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f170188q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f170189r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f170190s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f170191t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f170192v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        float f170193w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f170194x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f170196z;

        C4309e(tq.e<? super C4309e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170194x = obj;
            this.f170196z |= PKIFailureInfo.systemUnavail;
            return e.this.g(null, this);
        }
    }

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f170166h = e1.i(wx.d.j0(companion.u()), wx.d.j0(companion.K()), wx.d.j0(companion.t()), wx.d.j0(companion.f()), wx.d.j0(companion.v()), wx.d.j0(companion.R()));
    }

    public e(q qVar, b00.g gVar, az.f fVar, mx.c cVar, b bVar) {
        this.validatePickedFilesSize = qVar;
        this.mediaPickerManager = gVar;
        this.fileDataManager = fVar;
        this.labelProvider = cVar;
        this.createFileHandlerUC = bVar;
    }

    private final dx.b.Business d() {
        return new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(e02.a.F), this.labelProvider.c(e02.a.E), null, this.labelProvider.c(e02.a.f46550j), null, 82, null);
    }

    private final dx.b.Business e(Set<wx.d> allowedExtensions) {
        return new dx.b.Business(null, null, this.labelProvider.c(e02.a.H), this.labelProvider.e(e02.a.I, v.v0(allowedExtensions, " , ", null, null, 0, null, d.f170176a, 30, null)), null, this.labelProvider.c(e02.a.f46550j), null, 83, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ dx.b.Business f(e eVar, Set set, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            set = f170166h;
        }
        return eVar.e(set);
    }

    private final boolean h(String str) {
        return f170166h.contains(wx.d.j0(str));
    }

    private final dx.b.Business i() {
        return new dx.b.Business(zb4.b.NO_PHOTO_PICKED, null, Label.INSTANCE.c(), null, null, this.labelProvider.c(e02.a.f46550j), null, 90, null);
    }

    private final dx.b.Business j() {
        return new dx.b.Business(null, null, this.labelProvider.c(e02.a.D0), null, null, this.labelProvider.c(e02.a.f46550j), null, 91, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0342  */
    /* JADX WARN: Code duplicated, block: B:111:0x0363 A[Catch: Exception -> 0x0357, c -> 0x035b, CancellationException -> 0x035f, TRY_ENTER, TryCatch #19 {c -> 0x035b, CancellationException -> 0x035f, Exception -> 0x0357, blocks: (B:96:0x02a3, B:98:0x02a7, B:111:0x0363, B:112:0x036f), top: B:193:0x02a3 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x038e  */
    /* JADX WARN: Code duplicated, block: B:128:0x039d A[Catch: Exception -> 0x0370, c -> 0x0375, CancellationException -> 0x037a, TryCatch #20 {c -> 0x0375, CancellationException -> 0x037a, Exception -> 0x0370, blocks: (B:91:0x0271, B:126:0x0390, B:127:0x039c, B:128:0x039d, B:129:0x03ad, B:136:0x03bd, B:137:0x03cd), top: B:192:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x03bd A[Catch: Exception -> 0x0370, c -> 0x0375, CancellationException -> 0x037a, TryCatch #20 {c -> 0x0375, CancellationException -> 0x037a, Exception -> 0x0370, blocks: (B:91:0x0271, B:126:0x0390, B:127:0x039c, B:128:0x039d, B:129:0x03ad, B:136:0x03bd, B:137:0x03cd), top: B:192:0x01e4 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0421  */
    /* JADX WARN: Code duplicated, block: B:169:0x0424  */
    /* JADX WARN: Code duplicated, block: B:172:0x0434  */
    /* JADX WARN: Code duplicated, block: B:173:0x0442  */
    /* JADX WARN: Code duplicated, block: B:175:0x0446  */
    /* JADX WARN: Code duplicated, block: B:178:0x0452  */
    /* JADX WARN: Code duplicated, block: B:182:0x020a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0213 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01fa A[Catch: Exception -> 0x037f, c -> 0x0384, CancellationException -> 0x0389, TRY_LEAVE, TryCatch #17 {c -> 0x0384, CancellationException -> 0x0389, Exception -> 0x037f, blocks: (B:68:0x01f0, B:70:0x01fa, B:89:0x0265, B:81:0x021f, B:82:0x0223), top: B:196:0x01f0 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0213 A[EDGE_INSN: B:74:0x0213->B:88:0x0263 BREAK  A[LOOP:0: B:82:0x0223->B:87:0x0260]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0229 A[Catch: Exception -> 0x0216, c -> 0x0219, CancellationException -> 0x021c, TRY_ENTER, TRY_LEAVE, TryCatch #24 {Exception -> 0x0216, blocks: (B:103:0x0343, B:162:0x0409, B:165:0x0418, B:72:0x020a, B:84:0x0229), top: B:181:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0260 A[LOOP:0: B:82:0x0223->B:87:0x0260, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x0265 A[Catch: Exception -> 0x037f, c -> 0x0384, CancellationException -> 0x0389, TRY_ENTER, TRY_LEAVE, TryCatch #17 {c -> 0x0384, CancellationException -> 0x0389, Exception -> 0x037f, blocks: (B:68:0x01f0, B:70:0x01fa, B:89:0x0265, B:81:0x021f, B:82:0x0223), top: B:196:0x01f0 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0298  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a7 A[Catch: Exception -> 0x0357, c -> 0x035b, CancellationException -> 0x035f, TRY_LEAVE, TryCatch #19 {c -> 0x035b, CancellationException -> 0x035f, Exception -> 0x0357, blocks: (B:96:0x02a3, B:98:0x02a7, B:111:0x0363, B:112:0x036f), top: B:193:0x02a3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:84:0x0229, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0371: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:114:0x0371 */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x0376: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:116:0x0376 */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x037b: MOVE (r4 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:118:0x037b */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public Object g(Params params, tq.e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        C4309e c4309e;
        String message;
        String str;
        i iVarA;
        Object objB;
        ex.b aVar;
        Object objJ;
        j<dx.b> jVar;
        Params params2;
        ex.b bVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        j<dx.b> jVar2;
        int i25;
        int i26;
        int i27;
        ex.b bVar2;
        Uri uri;
        int i28;
        ex.b bVar3;
        ex.b bVar4;
        Object obj;
        int i29;
        int i35;
        Object obj2;
        String str2;
        String strK0;
        List<m02.c> listA;
        boolean z15;
        ?? r18;
        Object objK;
        Object obj3;
        ex.b bVar5;
        Object obj4;
        int i36;
        int i37;
        Uri uri2;
        int i38;
        String str3;
        ?? r15;
        Iterator it;
        m02.c cVar;
        Iterator it4;
        Float f15;
        Object obj5;
        if (eVar instanceof C4309e) {
            c4309e = (C4309e) eVar;
            int i39 = c4309e.f170196z;
            if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                c4309e.f170196z = i39 - PKIFailureInfo.systemUnavail;
            } else {
                c4309e = new C4309e(eVar);
            }
        } else {
            c4309e = new C4309e(eVar);
        }
        Object objD = c4309e.f170194x;
        Object objE = uq.b.e();
        ?? r16 = c4309e.f170196z;
        String str4 = "";
        try {
            try {
                try {
                    try {
                        if (r16 == 0) {
                            u.b(objD);
                            j<dx.b> jVarA = xw.c.f221622a.a();
                            aVar = new ex.a();
                            b00.g gVar = this.mediaPickerManager;
                            b00.j jVar3 = b00.j.IMAGE;
                            c4309e.f170177d = params;
                            c4309e.f170178e = jVarA;
                            c4309e.f170179f = vq.j.a(aVar);
                            c4309e.f170180g = aVar;
                            c4309e.f170186n = 0;
                            c4309e.f170187p = 0;
                            c4309e.f170188q = 0;
                            c4309e.f170189r = 0;
                            c4309e.f170190s = 0;
                            c4309e.f170196z = 1;
                            objJ = gVar.j(jVar3, c4309e);
                            if (objJ != objE) {
                                jVar = jVarA;
                                params2 = params;
                                bVar = aVar;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                            }
                            return objE;
                        }
                        if (r16 == 1) {
                            int i45 = c4309e.f170190s;
                            int i46 = c4309e.f170189r;
                            int i47 = c4309e.f170188q;
                            int i48 = c4309e.f170187p;
                            int i49 = c4309e.f170186n;
                            ex.b bVar6 = (ex.b) c4309e.f170180g;
                            aVar = (ex.b) c4309e.f170179f;
                            jVar = (j) c4309e.f170178e;
                            params2 = (Params) c4309e.f170177d;
                            try {
                                u.b(objD);
                                bVar = bVar6;
                                i19 = i49;
                                i18 = i48;
                                i17 = i47;
                                i16 = i46;
                                i15 = i45;
                                objJ = objD;
                            } catch (ex.c e15) {
                                e = e15;
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                str4 = "";
                                r16 = jVar;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    str = str4;
                                } else {
                                    str = message;
                                }
                                fVar.d(str, e, px.c.a(r16));
                                iVarA = r16.a(e);
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
                            if (r16 != 2) {
                                if (r16 == 3) {
                                    int i55 = c4309e.f170191t;
                                    i37 = c4309e.f170190s;
                                    i29 = c4309e.f170189r;
                                    int i56 = c4309e.f170188q;
                                    i38 = c4309e.f170187p;
                                    i36 = c4309e.f170186n;
                                    String str5 = (String) c4309e.f170183k;
                                    String str6 = (String) c4309e.f170182j;
                                    uri2 = (Uri) c4309e.f170181h;
                                    ex.b bVar7 = (ex.b) c4309e.f170180g;
                                    ex.b bVar8 = (ex.b) c4309e.f170179f;
                                    j jVar4 = (j) c4309e.f170178e;
                                    Params params3 = (Params) c4309e.f170177d;
                                    try {
                                        u.b(objD);
                                        str4 = "";
                                        str3 = str6;
                                        r15 = jVar4;
                                        str2 = str5;
                                        i35 = i55;
                                        obj3 = objE;
                                        bVar5 = bVar7;
                                        i25 = i56;
                                        params2 = params3;
                                        obj4 = objD;
                                        bVar4 = bVar8;
                                        try {
                                            f15 = (Float) obj4;
                                            if (f15 == null) {
                                                bVar5.b(j());
                                                throw new oq.g();
                                            }
                                            float fFloatValue = f15.floatValue();
                                            Uri uri3 = uri2;
                                            Params params4 = params2;
                                            obj5 = obj3;
                                            int i57 = i35;
                                            int i58 = i37;
                                            bVar5.a(this.validatePickedFilesSize.a(new q.Params(new FileSizeLimit(m02.d.c(params4.a()), params4.getMaxAllPhotoSizeInBytes()), new FileSizeLimit(fFloatValue, params4.getMaxPhotoSizeInBytes()))));
                                            FilePickerMetadata filePickerMetadata = new FilePickerMetadata(r.s1(str2, ".", null, 2, null), str3, fFloatValue, uri3.toString());
                                            b bVar9 = this.createFileHandlerUC;
                                            b.Params params5 = new b.Params(filePickerMetadata);
                                            c4309e.f170177d = vq.j.a(params4);
                                            c4309e.f170178e = r15;
                                            c4309e.f170179f = vq.j.a(bVar4);
                                            c4309e.f170180g = bVar5;
                                            c4309e.f170181h = vq.j.a(uri3);
                                            c4309e.f170182j = vq.j.a(str3);
                                            c4309e.f170183k = vq.j.a(str2);
                                            c4309e.f170184l = vq.j.a(filePickerMetadata);
                                            c4309e.f170185m = bVar5;
                                            c4309e.f170186n = i36;
                                            c4309e.f170187p = i38;
                                            c4309e.f170188q = i25;
                                            c4309e.f170189r = i29;
                                            c4309e.f170190s = i58;
                                            c4309e.f170191t = i57;
                                            c4309e.f170193w = fFloatValue;
                                            c4309e.f170192v = 0;
                                            c4309e.f170196z = 4;
                                            objD = bVar9.d(params5, c4309e);
                                            if (objD == obj5) {
                                                return obj5;
                                            }
                                        } catch (ex.c e18) {
                                            e = e18;
                                        } catch (CancellationException e19) {
                                            throw e19;
                                        } catch (Exception e25) {
                                            e = e25;
                                            r16 = r15;
                                            px.f fVar2 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                str = str4;
                                            } else {
                                                str = message;
                                            }
                                            fVar2.d(str, e, px.c.a(r16));
                                            iVarA = r16.a(e);
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
                                    } catch (ex.c e26) {
                                        e = e26;
                                    } catch (CancellationException e27) {
                                        throw e27;
                                    } catch (Exception e28) {
                                        e = e28;
                                        str4 = "";
                                        r16 = jVar4;
                                        px.f fVar3 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            str = str4;
                                        } else {
                                            str = message;
                                        }
                                        fVar3.d(str, e, px.c.a(r16));
                                        iVarA = r16.a(e);
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
                                    if (r16 != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar5 = (ex.b) c4309e.f170185m;
                                    u.b(objD);
                                }
                                return new i.Right(new Result((zz.a) bVar5.a((i) objD)));
                            }
                            int i59 = c4309e.f170191t;
                            int i65 = c4309e.f170190s;
                            int i66 = c4309e.f170189r;
                            int i67 = c4309e.f170188q;
                            int i68 = c4309e.f170187p;
                            int i69 = c4309e.f170186n;
                            ex.b bVar10 = (ex.b) c4309e.f170182j;
                            uri = (Uri) c4309e.f170181h;
                            ex.b bVar11 = (ex.b) c4309e.f170180g;
                            ex.b bVar12 = (ex.b) c4309e.f170179f;
                            j jVar5 = (j) c4309e.f170178e;
                            Params params6 = (Params) c4309e.f170177d;
                            try {
                                u.b(objD);
                                i35 = i59;
                                obj = objD;
                                bVar4 = bVar12;
                                i27 = i69;
                                i25 = i67;
                                i28 = i65;
                                r16 = jVar5;
                                i29 = i66;
                                params2 = params6;
                                bVar3 = bVar11;
                                i26 = i68;
                                bVar2 = bVar10;
                                try {
                                    if (obj != null) {
                                        bVar2.b(j());
                                        throw new oq.g();
                                    }
                                    try {
                                        str2 = (String) obj;
                                        str4 = "";
                                        try {
                                            strK0 = wx.d.k0(r.i1(str2, ".", ""));
                                            if (h(strK0)) {
                                                bVar3.b(f(this, null, 1, null));
                                                throw new oq.g();
                                            }
                                            listA = params2.a();
                                            if (listA instanceof Collection) {
                                                try {
                                                    if (listA.isEmpty()) {
                                                        z15 = false;
                                                        break;
                                                    }
                                                    if (!z15) {
                                                        bVar3.b(d());
                                                        throw new oq.g();
                                                    }
                                                    az.f fVar4 = this.fileDataManager;
                                                    String string = uri.toString();
                                                    c4309e.f170177d = params2;
                                                    c4309e.f170178e = r16;
                                                    r18 = r16;
                                                    c4309e.f170179f = vq.j.a(bVar4);
                                                    c4309e.f170180g = bVar3;
                                                    c4309e.f170181h = uri;
                                                    c4309e.f170182j = strK0;
                                                    c4309e.f170183k = str2;
                                                    c4309e.f170186n = i27;
                                                    c4309e.f170187p = i26;
                                                    c4309e.f170188q = i25;
                                                    c4309e.f170189r = i29;
                                                    c4309e.f170190s = i28;
                                                    c4309e.f170191t = i35;
                                                    c4309e.f170196z = 3;
                                                    objK = fVar4.k(string, c4309e);
                                                    obj3 = objE;
                                                    if (objK == obj3) {
                                                        return obj3;
                                                    }
                                                    bVar5 = bVar3;
                                                    obj4 = objK;
                                                    int i75 = i26;
                                                    i36 = i27;
                                                    i37 = i28;
                                                    uri2 = uri;
                                                    i38 = i75;
                                                    str3 = strK0;
                                                    r15 = r18;
                                                    f15 = (Float) obj4;
                                                    if (f15 == null) {
                                                        bVar5.b(j());
                                                        throw new oq.g();
                                                    }
                                                    float fFloatValue2 = f15.floatValue();
                                                    Uri uri4 = uri2;
                                                    Params params7 = params2;
                                                    obj5 = obj3;
                                                    int i510 = i35;
                                                    int i511 = i37;
                                                    bVar5.a(this.validatePickedFilesSize.a(new q.Params(new FileSizeLimit(m02.d.c(params7.a()), params7.getMaxAllPhotoSizeInBytes()), new FileSizeLimit(fFloatValue2, params7.getMaxPhotoSizeInBytes()))));
                                                    FilePickerMetadata filePickerMetadata2 = new FilePickerMetadata(r.s1(str2, ".", null, 2, null), str3, fFloatValue2, uri4.toString());
                                                    b bVar13 = this.createFileHandlerUC;
                                                    b.Params params8 = new b.Params(filePickerMetadata2);
                                                    c4309e.f170177d = vq.j.a(params7);
                                                    c4309e.f170178e = r15;
                                                    c4309e.f170179f = vq.j.a(bVar4);
                                                    c4309e.f170180g = bVar5;
                                                    c4309e.f170181h = vq.j.a(uri4);
                                                    c4309e.f170182j = vq.j.a(str3);
                                                    c4309e.f170183k = vq.j.a(str2);
                                                    c4309e.f170184l = vq.j.a(filePickerMetadata2);
                                                    c4309e.f170185m = bVar5;
                                                    c4309e.f170186n = i36;
                                                    c4309e.f170187p = i38;
                                                    c4309e.f170188q = i25;
                                                    c4309e.f170189r = i29;
                                                    c4309e.f170190s = i511;
                                                    c4309e.f170191t = i510;
                                                    c4309e.f170193w = fFloatValue2;
                                                    c4309e.f170192v = 0;
                                                    c4309e.f170196z = 4;
                                                    objD = bVar13.d(params8, c4309e);
                                                    if (objD == obj5) {
                                                        return obj5;
                                                    }
                                                    return new i.Right(new Result((zz.a) bVar5.a((i) objD)));
                                                } catch (ex.c e29) {
                                                    e = e29;
                                                } catch (CancellationException e35) {
                                                    throw e35;
                                                }
                                            }
                                            it = listA.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    z15 = false;
                                                    break;
                                                }
                                                cVar = (m02.c) it.next();
                                                it4 = it;
                                                if (t.c(cVar.getMetadata().getName() + '.' + cVar.getMetadata().getExtension(), str2)) {
                                                    z15 = true;
                                                    break;
                                                }
                                                it = it4;
                                            }
                                            if (!z15) {
                                                bVar3.b(d());
                                                throw new oq.g();
                                            }
                                            az.f fVar5 = this.fileDataManager;
                                            String string2 = uri.toString();
                                            c4309e.f170177d = params2;
                                            c4309e.f170178e = r16;
                                            r18 = r16;
                                            c4309e.f170179f = vq.j.a(bVar4);
                                            c4309e.f170180g = bVar3;
                                            c4309e.f170181h = uri;
                                            c4309e.f170182j = strK0;
                                            c4309e.f170183k = str2;
                                            c4309e.f170186n = i27;
                                            c4309e.f170187p = i26;
                                            c4309e.f170188q = i25;
                                            c4309e.f170189r = i29;
                                            c4309e.f170190s = i28;
                                            c4309e.f170191t = i35;
                                            c4309e.f170196z = 3;
                                            objK = fVar5.k(string2, c4309e);
                                            obj3 = objE;
                                            if (objK == obj3) {
                                                return obj3;
                                            }
                                            bVar5 = bVar3;
                                            obj4 = objK;
                                            int i76 = i26;
                                            i36 = i27;
                                            i37 = i28;
                                            uri2 = uri;
                                            i38 = i76;
                                            str3 = strK0;
                                            r15 = r18;
                                            f15 = (Float) obj4;
                                            if (f15 == null) {
                                                bVar5.b(j());
                                                throw new oq.g();
                                            }
                                            float fFloatValue3 = f15.floatValue();
                                            Uri uri5 = uri2;
                                            Params params9 = params2;
                                            obj5 = obj3;
                                            int i512 = i35;
                                            int i513 = i37;
                                            bVar5.a(this.validatePickedFilesSize.a(new q.Params(new FileSizeLimit(m02.d.c(params9.a()), params9.getMaxAllPhotoSizeInBytes()), new FileSizeLimit(fFloatValue3, params9.getMaxPhotoSizeInBytes()))));
                                            FilePickerMetadata filePickerMetadata3 = new FilePickerMetadata(r.s1(str2, ".", null, 2, null), str3, fFloatValue3, uri5.toString());
                                            b bVar14 = this.createFileHandlerUC;
                                            b.Params params10 = new b.Params(filePickerMetadata3);
                                            c4309e.f170177d = vq.j.a(params9);
                                            c4309e.f170178e = r15;
                                            c4309e.f170179f = vq.j.a(bVar4);
                                            c4309e.f170180g = bVar5;
                                            c4309e.f170181h = vq.j.a(uri5);
                                            c4309e.f170182j = vq.j.a(str3);
                                            c4309e.f170183k = vq.j.a(str2);
                                            c4309e.f170184l = vq.j.a(filePickerMetadata3);
                                            c4309e.f170185m = bVar5;
                                            c4309e.f170186n = i36;
                                            c4309e.f170187p = i38;
                                            c4309e.f170188q = i25;
                                            c4309e.f170189r = i29;
                                            c4309e.f170190s = i513;
                                            c4309e.f170191t = i512;
                                            c4309e.f170193w = fFloatValue3;
                                            c4309e.f170192v = 0;
                                            c4309e.f170196z = 4;
                                            objD = bVar14.d(params10, c4309e);
                                            if (objD == obj5) {
                                                return obj5;
                                            }
                                            return new i.Right(new Result((zz.a) bVar5.a((i) objD)));
                                        } catch (ex.c e36) {
                                            e = e36;
                                        } catch (CancellationException e37) {
                                            throw e37;
                                        } catch (Exception e38) {
                                            e = e38;
                                            px.f fVar6 = px.f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                str = str4;
                                            } else {
                                                str = message;
                                            }
                                            fVar6.d(str, e, px.c.a(r16));
                                            iVarA = r16.a(e);
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
                                    } catch (ex.c e39) {
                                        e = e39;
                                    } catch (CancellationException e45) {
                                        e = e45;
                                        throw e;
                                    } catch (Exception e46) {
                                        e = e46;
                                        str4 = "";
                                        px.f fVar7 = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            str = str4;
                                        } else {
                                            str = message;
                                        }
                                        fVar7.d(str, e, px.c.a(r16));
                                        iVarA = r16.a(e);
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
                                    return new i.Left((dx.b) ex.d.a(e));
                                } catch (ex.c e47) {
                                    e = e47;
                                } catch (CancellationException e48) {
                                    throw e48;
                                } catch (Exception e49) {
                                    e = e49;
                                    r16 = obj2;
                                }
                            } catch (ex.c e55) {
                                e = e55;
                            } catch (CancellationException e56) {
                                throw e56;
                            } catch (Exception e57) {
                                e = e57;
                                str4 = "";
                                r16 = jVar5;
                                px.f fVar8 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    str = str4;
                                } else {
                                    str = message;
                                }
                                fVar8.d(str, e, px.c.a(r16));
                                iVarA = r16.a(e);
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
                        Uri uri6 = (Uri) objJ;
                        if (uri6 != null) {
                            az.f fVar9 = this.fileDataManager;
                            ex.b bVar15 = aVar;
                            String string3 = uri6.toString();
                            c4309e.f170177d = params2;
                            c4309e.f170178e = jVar;
                            jVar2 = jVar;
                            try {
                                c4309e.f170179f = vq.j.a(bVar15);
                                c4309e.f170180g = bVar;
                                c4309e.f170181h = uri6;
                                c4309e.f170182j = bVar;
                                c4309e.f170186n = i19;
                                c4309e.f170187p = i18;
                                c4309e.f170188q = i17;
                                c4309e.f170189r = i16;
                                c4309e.f170190s = i15;
                                c4309e.f170191t = 0;
                                c4309e.f170196z = 2;
                                Object objF = fVar9.f(string3, c4309e);
                                if (objF != objE) {
                                    i25 = i17;
                                    i26 = i18;
                                    i27 = i19;
                                    bVar2 = bVar;
                                    uri = uri6;
                                    i28 = i15;
                                    bVar3 = bVar2;
                                    r16 = jVar2;
                                    bVar4 = bVar15;
                                    obj = objF;
                                    i29 = i16;
                                    i35 = 0;
                                    if (obj != null) {
                                        bVar2.b(j());
                                        throw new oq.g();
                                    }
                                    str2 = (String) obj;
                                    str4 = "";
                                    strK0 = wx.d.k0(r.i1(str2, ".", ""));
                                    if (h(strK0)) {
                                        bVar3.b(f(this, null, 1, null));
                                        throw new oq.g();
                                    }
                                    listA = params2.a();
                                    if (listA instanceof Collection) {
                                        if (listA.isEmpty()) {
                                            z15 = false;
                                            break;
                                        }
                                        if (!z15) {
                                            bVar3.b(d());
                                            throw new oq.g();
                                        }
                                        az.f fVar10 = this.fileDataManager;
                                        String string4 = uri.toString();
                                        c4309e.f170177d = params2;
                                        c4309e.f170178e = r16;
                                        r18 = r16;
                                        c4309e.f170179f = vq.j.a(bVar4);
                                        c4309e.f170180g = bVar3;
                                        c4309e.f170181h = uri;
                                        c4309e.f170182j = strK0;
                                        c4309e.f170183k = str2;
                                        c4309e.f170186n = i27;
                                        c4309e.f170187p = i26;
                                        c4309e.f170188q = i25;
                                        c4309e.f170189r = i29;
                                        c4309e.f170190s = i28;
                                        c4309e.f170191t = i35;
                                        c4309e.f170196z = 3;
                                        objK = fVar10.k(string4, c4309e);
                                        obj3 = objE;
                                        if (objK == obj3) {
                                            return obj3;
                                        }
                                        bVar5 = bVar3;
                                        obj4 = objK;
                                        int i77 = i26;
                                        i36 = i27;
                                        i37 = i28;
                                        uri2 = uri;
                                        i38 = i77;
                                        str3 = strK0;
                                        r15 = r18;
                                        f15 = (Float) obj4;
                                        if (f15 == null) {
                                            bVar5.b(j());
                                            throw new oq.g();
                                        }
                                        float fFloatValue4 = f15.floatValue();
                                        Uri uri7 = uri2;
                                        Params params11 = params2;
                                        obj5 = obj3;
                                        int i514 = i35;
                                        int i515 = i37;
                                        bVar5.a(this.validatePickedFilesSize.a(new q.Params(new FileSizeLimit(m02.d.c(params11.a()), params11.getMaxAllPhotoSizeInBytes()), new FileSizeLimit(fFloatValue4, params11.getMaxPhotoSizeInBytes()))));
                                        FilePickerMetadata filePickerMetadata4 = new FilePickerMetadata(r.s1(str2, ".", null, 2, null), str3, fFloatValue4, uri7.toString());
                                        b bVar16 = this.createFileHandlerUC;
                                        b.Params params12 = new b.Params(filePickerMetadata4);
                                        c4309e.f170177d = vq.j.a(params11);
                                        c4309e.f170178e = r15;
                                        c4309e.f170179f = vq.j.a(bVar4);
                                        c4309e.f170180g = bVar5;
                                        c4309e.f170181h = vq.j.a(uri7);
                                        c4309e.f170182j = vq.j.a(str3);
                                        c4309e.f170183k = vq.j.a(str2);
                                        c4309e.f170184l = vq.j.a(filePickerMetadata4);
                                        c4309e.f170185m = bVar5;
                                        c4309e.f170186n = i36;
                                        c4309e.f170187p = i38;
                                        c4309e.f170188q = i25;
                                        c4309e.f170189r = i29;
                                        c4309e.f170190s = i515;
                                        c4309e.f170191t = i514;
                                        c4309e.f170193w = fFloatValue4;
                                        c4309e.f170192v = 0;
                                        c4309e.f170196z = 4;
                                        objD = bVar16.d(params12, c4309e);
                                        if (objD == obj5) {
                                            return obj5;
                                        }
                                        return new i.Right(new Result((zz.a) bVar5.a((i) objD)));
                                    }
                                    it = listA.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            z15 = false;
                                            break;
                                        }
                                        cVar = (m02.c) it.next();
                                        it4 = it;
                                        if (t.c(cVar.getMetadata().getName() + '.' + cVar.getMetadata().getExtension(), str2)) {
                                            z15 = true;
                                            break;
                                        }
                                        it = it4;
                                    }
                                    if (!z15) {
                                        bVar3.b(d());
                                        throw new oq.g();
                                    }
                                    az.f fVar11 = this.fileDataManager;
                                    String string5 = uri.toString();
                                    c4309e.f170177d = params2;
                                    c4309e.f170178e = r16;
                                    r18 = r16;
                                    c4309e.f170179f = vq.j.a(bVar4);
                                    c4309e.f170180g = bVar3;
                                    c4309e.f170181h = uri;
                                    c4309e.f170182j = strK0;
                                    c4309e.f170183k = str2;
                                    c4309e.f170186n = i27;
                                    c4309e.f170187p = i26;
                                    c4309e.f170188q = i25;
                                    c4309e.f170189r = i29;
                                    c4309e.f170190s = i28;
                                    c4309e.f170191t = i35;
                                    c4309e.f170196z = 3;
                                    objK = fVar11.k(string5, c4309e);
                                    obj3 = objE;
                                    if (objK == obj3) {
                                        return obj3;
                                    }
                                    bVar5 = bVar3;
                                    obj4 = objK;
                                    int i78 = i26;
                                    i36 = i27;
                                    i37 = i28;
                                    uri2 = uri;
                                    i38 = i78;
                                    str3 = strK0;
                                    r15 = r18;
                                    f15 = (Float) obj4;
                                    if (f15 == null) {
                                        bVar5.b(j());
                                        throw new oq.g();
                                    }
                                    float fFloatValue5 = f15.floatValue();
                                    Uri uri8 = uri2;
                                    Params params13 = params2;
                                    obj5 = obj3;
                                    int i516 = i35;
                                    int i517 = i37;
                                    bVar5.a(this.validatePickedFilesSize.a(new q.Params(new FileSizeLimit(m02.d.c(params13.a()), params13.getMaxAllPhotoSizeInBytes()), new FileSizeLimit(fFloatValue5, params13.getMaxPhotoSizeInBytes()))));
                                    FilePickerMetadata filePickerMetadata5 = new FilePickerMetadata(r.s1(str2, ".", null, 2, null), str3, fFloatValue5, uri8.toString());
                                    b bVar17 = this.createFileHandlerUC;
                                    b.Params params14 = new b.Params(filePickerMetadata5);
                                    c4309e.f170177d = vq.j.a(params13);
                                    c4309e.f170178e = r15;
                                    c4309e.f170179f = vq.j.a(bVar4);
                                    c4309e.f170180g = bVar5;
                                    c4309e.f170181h = vq.j.a(uri8);
                                    c4309e.f170182j = vq.j.a(str3);
                                    c4309e.f170183k = vq.j.a(str2);
                                    c4309e.f170184l = vq.j.a(filePickerMetadata5);
                                    c4309e.f170185m = bVar5;
                                    c4309e.f170186n = i36;
                                    c4309e.f170187p = i38;
                                    c4309e.f170188q = i25;
                                    c4309e.f170189r = i29;
                                    c4309e.f170190s = i517;
                                    c4309e.f170191t = i516;
                                    c4309e.f170193w = fFloatValue5;
                                    c4309e.f170192v = 0;
                                    c4309e.f170196z = 4;
                                    objD = bVar17.d(params14, c4309e);
                                    if (objD == obj5) {
                                        return obj5;
                                    }
                                    return new i.Right(new Result((zz.a) bVar5.a((i) objD)));
                                }
                                return objE;
                            } catch (ex.c e58) {
                                e = e58;
                            } catch (CancellationException e59) {
                                e = e59;
                                throw e;
                            } catch (Exception e65) {
                                e = e65;
                                r16 = jVar2;
                                px.f fVar12 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    str = str4;
                                } else {
                                    str = message;
                                }
                                fVar12.d(str, e, px.c.a(r16));
                                iVarA = r16.a(e);
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
                            jVar2 = jVar;
                            try {
                                bVar.b(i());
                                throw new oq.g();
                            } catch (ex.c e66) {
                                e = e66;
                            } catch (CancellationException e67) {
                                e = e67;
                                throw e;
                            } catch (Exception e68) {
                                e = e68;
                                r16 = jVar2;
                                px.f fVar13 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    str = str4;
                                } else {
                                    str = message;
                                }
                                fVar13.d(str, e, px.c.a(r16));
                                iVarA = r16.a(e);
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
                    } catch (ex.c e69) {
                        e = e69;
                        jVar2 = jVar;
                    } catch (CancellationException e75) {
                        e = e75;
                        jVar2 = jVar;
                    } catch (Exception e76) {
                        e = e76;
                        jVar2 = jVar;
                    }
                } catch (CancellationException e77) {
                    throw e77;
                }
            } catch (Exception e78) {
                e = e78;
            }
        } catch (ex.c e79) {
            e = e79;
        } catch (CancellationException e85) {
            e = e85;
        } catch (Exception e86) {
            e = e86;
        }
        return new i.Left((dx.b) ex.d.a(e));
    }
}
