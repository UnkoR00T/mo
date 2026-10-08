package hc4;

import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096B¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"Lhc4/m;", "Lbc4/n;", "Lbc4/b;", "checkFileSizeUseCase", "Lzz/b;", "filePickerManager", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "Lxx/a;", "exifDataManager", "Lbc4/o;", "rotateImageUC", "<init>", "(Lbc4/b;Lzz/b;Laz/f;Lmx/c;Lxx/a;Lbc4/o;)V", "Ldx/b$c;", "d", "()Ldx/b$c;", "h", "g", "", "Lwx/f;", "e", "()Ljava/util/List;", "Lbc4/n$b;", "params", "Ldx/i;", "Ldx/b;", "Lbc4/n$c;", "f", "(Lbc4/n$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/b;", "b", "Lzz/b;", "c", "Laz/f;", "Lmx/c;", "Lxx/a;", "Lbc4/o;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements bc4.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zz.b filePickerManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.o rotateImageUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {
        int B;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83507d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83508e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83509f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83510g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83511h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f83512j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f83513k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f83514l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f83515m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f83516n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f83517p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f83518q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f83519r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f83520s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f83521t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f83522v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f83523w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f83524x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        float f83525y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f83526z;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83526z = obj;
            this.B |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    public m(bc4.b bVar, zz.b bVar2, az.f fVar, mx.c cVar, xx.a aVar, bc4.o oVar) {
        this.checkFileSizeUseCase = bVar;
        this.filePickerManager = bVar2;
        this.fileDataManager = fVar;
        this.labelProvider = cVar;
        this.exifDataManager = aVar;
        this.rotateImageUC = oVar;
    }

    private final dx.b.Business d() {
        return new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(xb4.a.f217907e), this.labelProvider.c(xb4.a.f217906d), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    private final List<wx.f> e() {
        List listQ = v.q(wx.h.d.f215737b, wx.h.c.f215736b, wx.h.e.f215738b, wx.h.a.f215734b, wx.h.b.f215735b);
        ArrayList arrayList = new ArrayList(v.y(listQ, 10));
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((wx.h) it.next()).getFileType());
        }
        return arrayList;
    }

    private final dx.b.Business g() {
        return new dx.b.Business(zb4.b.NO_FILE_PICKED, null, Label.INSTANCE.c(), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null);
    }

    private final dx.b.Business h() {
        return new dx.b.Business(zb4.b.FILE_DATA_ERROR, null, this.labelProvider.c(xb4.a.f217926x), null, null, this.labelProvider.c(xb4.a.f217904b), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f3 A[Catch: Exception -> 0x01ce, c -> 0x01d4, CancellationException -> 0x01da, TRY_LEAVE, TryCatch #34 {c -> 0x01d4, CancellationException -> 0x01da, Exception -> 0x01ce, blocks: (B:49:0x01bf, B:100:0x02ef, B:102:0x02f3), top: B:299:0x01bf }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:124:0x033b  */
    /* JADX WARN: Code duplicated, block: B:128:0x036e  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:132:0x03af  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:136:0x03ca A[Catch: Exception -> 0x0585, c -> 0x0589, CancellationException -> 0x058d, TryCatch #25 {c -> 0x0589, CancellationException -> 0x058d, Exception -> 0x0585, blocks: (B:133:0x03bd, B:136:0x03ca, B:138:0x03ce, B:129:0x037a), top: B:317:0x037a }] */
    /* JADX WARN: Code duplicated, block: B:138:0x03ce A[Catch: Exception -> 0x0585, c -> 0x0589, CancellationException -> 0x058d, TRY_LEAVE, TryCatch #25 {c -> 0x0589, CancellationException -> 0x058d, Exception -> 0x0585, blocks: (B:133:0x03bd, B:136:0x03ca, B:138:0x03ce, B:129:0x037a), top: B:317:0x037a }] */
    /* JADX WARN: Code duplicated, block: B:141:0x03df A[Catch: Exception -> 0x03ea, c -> 0x03ef, CancellationException -> 0x03f4, TryCatch #30 {c -> 0x03ef, CancellationException -> 0x03f4, Exception -> 0x03ea, blocks: (B:139:0x03db, B:141:0x03df, B:149:0x03fc), top: B:307:0x03db }] */
    /* JADX WARN: Code duplicated, block: B:148:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:152:0x0441  */
    /* JADX WARN: Code duplicated, block: B:153:0x0446  */
    /* JADX WARN: Code duplicated, block: B:156:0x0463  */
    /* JADX WARN: Code duplicated, block: B:162:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:166:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:176:0x04d6 A[Catch: Exception -> 0x04cd, c -> 0x04d0, CancellationException -> 0x04d3, TRY_LEAVE, TryCatch #32 {c -> 0x04d0, CancellationException -> 0x04d3, Exception -> 0x04cd, blocks: (B:163:0x04be, B:167:0x04c6, B:176:0x04d6), top: B:303:0x04be }] */
    /* JADX WARN: Code duplicated, block: B:178:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:186:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:188:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:191:0x0503 A[Catch: Exception -> 0x04eb, c -> 0x04ee, CancellationException -> 0x04f1, TryCatch #0 {Exception -> 0x04eb, blocks: (B:179:0x04e6, B:189:0x04f9, B:191:0x0503, B:204:0x0543, B:205:0x055d, B:194:0x050d, B:195:0x0511, B:197:0x0517, B:199:0x0527, B:202:0x0536, B:203:0x0542, B:272:0x0626, B:275:0x0634, B:224:0x0591, B:225:0x0599, B:270:0x0620, B:271:0x0625), top: B:291:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:194:0x050d A[Catch: Exception -> 0x04eb, c -> 0x04ee, CancellationException -> 0x04f1, TryCatch #0 {Exception -> 0x04eb, blocks: (B:179:0x04e6, B:189:0x04f9, B:191:0x0503, B:204:0x0543, B:205:0x055d, B:194:0x050d, B:195:0x0511, B:197:0x0517, B:199:0x0527, B:202:0x0536, B:203:0x0542, B:272:0x0626, B:275:0x0634, B:224:0x0591, B:225:0x0599, B:270:0x0620, B:271:0x0625), top: B:291:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x0517 A[Catch: Exception -> 0x04eb, c -> 0x04ee, CancellationException -> 0x04f1, TryCatch #0 {Exception -> 0x04eb, blocks: (B:179:0x04e6, B:189:0x04f9, B:191:0x0503, B:204:0x0543, B:205:0x055d, B:194:0x050d, B:195:0x0511, B:197:0x0517, B:199:0x0527, B:202:0x0536, B:203:0x0542, B:272:0x0626, B:275:0x0634, B:224:0x0591, B:225:0x0599, B:270:0x0620, B:271:0x0625), top: B:291:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0591 A[Catch: Exception -> 0x04eb, c -> 0x04ee, CancellationException -> 0x04f1, TryCatch #0 {Exception -> 0x04eb, blocks: (B:179:0x04e6, B:189:0x04f9, B:191:0x0503, B:204:0x0543, B:205:0x055d, B:194:0x050d, B:195:0x0511, B:197:0x0517, B:199:0x0527, B:202:0x0536, B:203:0x0542, B:272:0x0626, B:275:0x0634, B:224:0x0591, B:225:0x0599, B:270:0x0620, B:271:0x0625), top: B:291:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:256:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:265:0x0603 A[Catch: Exception -> 0x05fd, c -> 0x05ff, CancellationException -> 0x0601, TryCatch #35 {c -> 0x05ff, CancellationException -> 0x0601, Exception -> 0x05fd, blocks: (B:257:0x05f0, B:258:0x05fc, B:265:0x0603, B:266:0x060c, B:267:0x060d, B:268:0x061d), top: B:298:0x029d }] */
    /* JADX WARN: Code duplicated, block: B:267:0x060d A[Catch: Exception -> 0x05fd, c -> 0x05ff, CancellationException -> 0x0601, TryCatch #35 {c -> 0x05ff, CancellationException -> 0x0601, Exception -> 0x05fd, blocks: (B:257:0x05f0, B:258:0x05fc, B:265:0x0603, B:266:0x060c, B:267:0x060d, B:268:0x061d), top: B:298:0x029d }] */
    /* JADX WARN: Code duplicated, block: B:278:0x063d  */
    /* JADX WARN: Code duplicated, block: B:279:0x063f  */
    /* JADX WARN: Code duplicated, block: B:282:0x064f  */
    /* JADX WARN: Code duplicated, block: B:283:0x065d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0661  */
    /* JADX WARN: Code duplicated, block: B:288:0x066e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0527 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0511 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:90:0x029f A[Catch: Exception -> 0x05d9, c -> 0x05e0, CancellationException -> 0x05e6, TryCatch #41 {c -> 0x05e0, CancellationException -> 0x05e6, Exception -> 0x05d9, blocks: (B:88:0x0295, B:90:0x029f, B:92:0x02a3, B:94:0x02ac), top: B:294:0x0295 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02a3 A[Catch: Exception -> 0x05d9, c -> 0x05e0, CancellationException -> 0x05e6, TryCatch #41 {c -> 0x05e0, CancellationException -> 0x05e6, Exception -> 0x05d9, blocks: (B:88:0x0295, B:90:0x029f, B:92:0x02a3, B:94:0x02ac), top: B:294:0x0295 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02ac A[Catch: Exception -> 0x05d9, c -> 0x05e0, CancellationException -> 0x05e6, TRY_LEAVE, TryCatch #41 {c -> 0x05e0, CancellationException -> 0x05e6, Exception -> 0x05d9, blocks: (B:88:0x0295, B:90:0x029f, B:92:0x02a3, B:94:0x02ac), top: B:294:0x0295 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02e3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [bc4.n$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [px.f] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [bc4.n$b] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.n.Params params, tq.e<? super dx.i<? extends dx.b, bc4.n.Result>> eVar) throws Throwable {
        a aVar;
        Object obj;
        dx.j<dx.b> jVarA;
        String message;
        ?? r15;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        List<wx.f> listE;
        ex.b bVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        zz.e eVar2;
        String strValueOf;
        dx.j<dx.b> jVar;
        Object objK;
        ?? r16;
        ex.b bVar2;
        zz.e eVar3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        String str;
        dx.j<dx.b> jVar2;
        dx.j<dx.b> jVar3;
        Float f15;
        float fFloatValue;
        Float maxPhotoSizeInBytes;
        String str2;
        Object objB2;
        float f16;
        int i35;
        String str3;
        ?? r17;
        int i36;
        ex.b bVar3;
        zz.e eVar4;
        Integer num;
        ?? r19;
        Object objM;
        Integer num2;
        int i37;
        String str4;
        int i38;
        zz.e eVar5;
        int i39;
        int i45;
        ex.b bVar4;
        int i46;
        float f17;
        ?? r18;
        dx.i right;
        zz.e eVar6;
        byte[] bArr;
        int iIntValue;
        Object objC;
        Integer num3;
        dx.i iVar;
        byte[] bArr2;
        int i47;
        int i48;
        ex.b bVar5;
        ex.b bVar6;
        int i49;
        int i55;
        String str5;
        ?? r25;
        int i56;
        int i57;
        int i58;
        byte[] bArr3;
        Object obj2;
        m mVar;
        ?? r26;
        Object objF;
        byte[] bArr4;
        String str6;
        ex.b bVar7;
        ?? r27;
        String str7;
        String strI1;
        String text;
        String str8;
        List<wx.i.Image> listA;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i59 = aVar.B;
            if ((i59 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.B = i59 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objI = aVar.f83526z;
        Object objE = uq.b.e();
        try {
            try {
                try {
                    try {
                        switch (aVar.B) {
                            case 0:
                                u.b(objI);
                                jVarA = xw.c.f221622a.a();
                                aVar2 = new ex.a();
                                zz.b bVar8 = this.filePickerManager;
                                bc4.n.a allowedPhotoFileTypes = params.getAllowedPhotoFileTypes();
                                if (t.c(allowedPhotoFileTypes, bc4.n.a.C0457a.f18216a)) {
                                    listE = e();
                                } else {
                                    if (!(allowedPhotoFileTypes instanceof bc4.n.a.b)) {
                                        throw new oq.p();
                                    }
                                    List<wx.h> listA2 = ((bc4.n.a.b) allowedPhotoFileTypes).a();
                                    ArrayList arrayList = new ArrayList(v.y(listA2, 10));
                                    Iterator it = listA2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((wx.h) it.next()).getFileType());
                                    }
                                    listE = arrayList;
                                }
                                aVar.f83507d = params;
                                aVar.f83508e = jVarA;
                                aVar.f83509f = vq.j.a(aVar2);
                                aVar.f83510g = aVar2;
                                aVar.f83518q = 0;
                                aVar.f83519r = 0;
                                aVar.f83520s = 0;
                                aVar.f83521t = 0;
                                aVar.f83522v = 0;
                                aVar.B = 1;
                                objI = bVar8.i(listE, aVar);
                                if (objI != objE) {
                                    obj = params;
                                    bVar = aVar2;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    try {
                                        eVar2 = (zz.e) objI;
                                        try {
                                            if (!t.c(eVar2, zz.e.a.f238544a)) {
                                                bVar.b(h());
                                                throw new oq.g();
                                            }
                                            if (eVar2 instanceof zz.e.UriResult) {
                                                throw new oq.p();
                                            }
                                            if (((zz.e.UriResult) eVar2).getUri() != null) {
                                                bVar.b(g());
                                                throw new oq.g();
                                            }
                                            strValueOf = String.valueOf(((zz.e.UriResult) eVar2).getUri());
                                            az.f fVar = this.fileDataManager;
                                            aVar.f83507d = obj;
                                            aVar.f83508e = jVarA;
                                            jVar = jVarA;
                                            try {
                                                aVar.f83509f = vq.j.a(aVar2);
                                                aVar.f83510g = bVar;
                                                aVar.f83511h = strValueOf;
                                                aVar.f83512j = vq.j.a(eVar2);
                                                aVar.f83518q = i19;
                                                aVar.f83519r = i18;
                                                aVar.f83520s = i17;
                                                aVar.f83521t = i16;
                                                aVar.f83522v = i15;
                                                aVar.B = 2;
                                                objK = fVar.k(strValueOf, aVar);
                                                if (objK != objE) {
                                                    r16 = obj;
                                                    bVar2 = aVar2;
                                                    eVar3 = eVar2;
                                                    objI = objK;
                                                    i25 = i19;
                                                    i26 = i18;
                                                    i27 = i17;
                                                    i28 = i16;
                                                    i29 = i15;
                                                    str = strValueOf;
                                                    jVar2 = jVar;
                                                    f15 = (Float) objI;
                                                    if (f15 == null) {
                                                        obj = "";
                                                        try {
                                                            bVar.b(h());
                                                            throw new oq.g();
                                                        } catch (ex.c e15) {
                                                            e = e15;
                                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                                        } catch (CancellationException e16) {
                                                            e = e16;
                                                            throw e;
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            jVarA = jVar2;
                                                            ?? r28 = px.f.f163100a;
                                                            message = e.getMessage();
                                                            if (message == null) {
                                                                r15 = obj;
                                                            } else {
                                                                r15 = message;
                                                            }
                                                            r28.d(r15, e, px.c.a(jVarA));
                                                            iVarA = jVarA.a(e);
                                                            if (iVarA instanceof dx.i.Left) {
                                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                            } else {
                                                                if (!(iVarA instanceof dx.i.Right)) {
                                                                    throw new oq.p();
                                                                }
                                                                objB = ((dx.i.Right) iVarA).b();
                                                            }
                                                            return new dx.i.Left(objB);
                                                        }
                                                    }
                                                    fFloatValue = f15.floatValue();
                                                    maxPhotoSizeInBytes = r16.getMaxPhotoSizeInBytes();
                                                    if (maxPhotoSizeInBytes != null) {
                                                        try {
                                                            str2 = "";
                                                            try {
                                                                bVar.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                                                                i0 i0Var = i0.f148189a;
                                                            } catch (ex.c e18) {
                                                                e = e18;
                                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                                            } catch (CancellationException e19) {
                                                                e = e19;
                                                                throw e;
                                                            } catch (Exception e25) {
                                                                e = e25;
                                                                jVarA = jVar2;
                                                                obj = str2;
                                                                ?? r29 = px.f.f163100a;
                                                                message = e.getMessage();
                                                                if (message == null) {
                                                                    r15 = obj;
                                                                } else {
                                                                    r15 = message;
                                                                }
                                                                r29.d(r15, e, px.c.a(jVarA));
                                                                iVarA = jVarA.a(e);
                                                                if (iVarA instanceof dx.i.Left) {
                                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                } else {
                                                                    if (!(iVarA instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    objB = ((dx.i.Right) iVarA).b();
                                                                }
                                                                return new dx.i.Left(objB);
                                                            }
                                                        } catch (ex.c e26) {
                                                            e = e26;
                                                            str2 = "";
                                                        } catch (CancellationException e27) {
                                                            e = e27;
                                                            str2 = "";
                                                        } catch (Exception e28) {
                                                            e = e28;
                                                            str2 = "";
                                                        }
                                                    } else {
                                                        str2 = "";
                                                    }
                                                    try {
                                                        xx.a aVar3 = this.exifDataManager;
                                                        aVar.f83507d = r16;
                                                        aVar.f83508e = jVar2;
                                                        aVar.f83509f = vq.j.a(bVar2);
                                                        aVar.f83510g = bVar;
                                                        aVar.f83511h = str;
                                                        aVar.f83512j = vq.j.a(eVar3);
                                                        aVar.f83518q = i25;
                                                        aVar.f83519r = i26;
                                                        aVar.f83520s = i27;
                                                        aVar.f83521t = i28;
                                                        aVar.f83522v = i29;
                                                        aVar.f83525y = fFloatValue;
                                                        aVar.B = 3;
                                                        objB2 = aVar3.b(str, aVar);
                                                        if (objB2 != objE) {
                                                            int i65 = i29;
                                                            f16 = fFloatValue;
                                                            objI = objB2;
                                                            i35 = i65;
                                                            ?? r110 = r16;
                                                            str3 = str;
                                                            r17 = r110;
                                                            i36 = i25;
                                                            jVarA = jVar2;
                                                            bVar3 = bVar;
                                                            eVar4 = eVar3;
                                                            try {
                                                                num = (Integer) objI;
                                                                az.f fVar2 = this.fileDataManager;
                                                                aVar.f83507d = r17;
                                                                aVar.f83508e = jVarA;
                                                                r19 = r17;
                                                                aVar.f83509f = vq.j.a(bVar2);
                                                                aVar.f83510g = bVar3;
                                                                aVar.f83511h = str3;
                                                                aVar.f83512j = bVar3;
                                                                aVar.f83513k = num;
                                                                aVar.f83514l = vq.j.a(eVar4);
                                                                aVar.f83518q = i36;
                                                                aVar.f83519r = i26;
                                                                aVar.f83520s = i27;
                                                                aVar.f83521t = i28;
                                                                aVar.f83522v = i35;
                                                                aVar.f83525y = f16;
                                                                aVar.B = 4;
                                                                objM = fVar2.m(str3, aVar);
                                                                if (objM != objE) {
                                                                    num2 = num;
                                                                    objI = objM;
                                                                    i37 = i36;
                                                                    str4 = str3;
                                                                    i38 = i27;
                                                                    eVar5 = eVar4;
                                                                    i39 = i28;
                                                                    i45 = i26;
                                                                    bVar4 = bVar3;
                                                                    i46 = i35;
                                                                    f17 = f16;
                                                                    r18 = r19;
                                                                    right = (dx.i) objI;
                                                                    eVar6 = eVar5;
                                                                    if (!(right instanceof dx.i.Left)) {
                                                                        if (!(right instanceof dx.i.Right)) {
                                                                            throw new oq.p();
                                                                        }
                                                                        bArr = (byte[]) ((dx.i.Right) right).b();
                                                                        bc4.o oVar = this.rotateImageUC;
                                                                        try {
                                                                            if (num2 != null) {
                                                                                iIntValue = num2.intValue();
                                                                            } else {
                                                                                iIntValue = 0;
                                                                            }
                                                                            bc4.o.Params params2 = new bc4.o.Params(iIntValue, bArr);
                                                                            aVar.f83507d = r18;
                                                                            aVar.f83508e = jVarA;
                                                                            aVar.f83509f = vq.j.a(bVar2);
                                                                            aVar.f83510g = bVar4;
                                                                            aVar.f83511h = str4;
                                                                            aVar.f83512j = bVar3;
                                                                            aVar.f83513k = vq.j.a(num2);
                                                                            aVar.f83514l = vq.j.a(right);
                                                                            aVar.f83515m = bArr;
                                                                            aVar.f83516n = vq.j.a(eVar6);
                                                                            aVar.f83518q = i37;
                                                                            aVar.f83519r = i45;
                                                                            aVar.f83520s = i38;
                                                                            aVar.f83521t = i39;
                                                                            aVar.f83522v = i46;
                                                                            aVar.f83525y = f17;
                                                                            aVar.f83523w = 0;
                                                                            aVar.f83524x = 0;
                                                                            aVar.B = 5;
                                                                            objC = oVar.c(params2, aVar);
                                                                            objE = objE;
                                                                            if (objC == objE) {
                                                                                return objE;
                                                                            }
                                                                            num3 = num2;
                                                                            iVar = right;
                                                                            objI = objC;
                                                                            bArr2 = bArr;
                                                                            i47 = 0;
                                                                            i48 = i45;
                                                                            jVar3 = jVarA;
                                                                            bVar5 = bVar4;
                                                                            bVar6 = bVar3;
                                                                            i49 = i38;
                                                                            i55 = i46;
                                                                            str5 = str4;
                                                                            r25 = r18;
                                                                            i56 = i37;
                                                                            i57 = i39;
                                                                            i58 = 0;
                                                                            try {
                                                                                bArr3 = (byte[]) ((dx.i) objI).a();
                                                                                if (bArr3 == null) {
                                                                                    bArr3 = bArr2;
                                                                                }
                                                                                obj2 = objE;
                                                                                int i66 = i58;
                                                                                mVar = this;
                                                                                try {
                                                                                    az.f fVar3 = mVar.fileDataManager;
                                                                                    aVar.f83507d = r25;
                                                                                    aVar.f83508e = jVar3;
                                                                                    r26 = r25;
                                                                                    aVar.f83509f = vq.j.a(bVar2);
                                                                                    aVar.f83510g = bVar5;
                                                                                    aVar.f83511h = str5;
                                                                                    aVar.f83512j = bVar6;
                                                                                    aVar.f83513k = vq.j.a(num3);
                                                                                    aVar.f83514l = vq.j.a(iVar);
                                                                                    aVar.f83515m = vq.j.a(bArr2);
                                                                                    aVar.f83516n = bArr3;
                                                                                    aVar.f83517p = vq.j.a(eVar6);
                                                                                    aVar.f83518q = i56;
                                                                                    aVar.f83519r = i48;
                                                                                    aVar.f83520s = i49;
                                                                                    aVar.f83521t = i57;
                                                                                    aVar.f83522v = i55;
                                                                                    aVar.f83525y = f17;
                                                                                    aVar.f83523w = i47;
                                                                                    aVar.f83524x = i66;
                                                                                    aVar.B = 6;
                                                                                    objF = fVar3.f(str5, aVar);
                                                                                    if (objF == obj2) {
                                                                                        return obj2;
                                                                                    }
                                                                                    bArr4 = bArr3;
                                                                                    objI = objF;
                                                                                    str6 = str5;
                                                                                    bVar7 = bVar5;
                                                                                    jVarA = jVar3;
                                                                                    r27 = r26;
                                                                                    try {
                                                                                        str7 = (String) objI;
                                                                                        strI1 = null;
                                                                                        if (str7 != null || (text = r.s1(str7, ".", null, 2, null)) == null) {
                                                                                            text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                                                                        }
                                                                                        if (str7 != null) {
                                                                                            str8 = str2;
                                                                                            strI1 = r.i1(str7, ".", str8);
                                                                                        } else {
                                                                                            str8 = str2;
                                                                                        }
                                                                                        if (strI1 == null) {
                                                                                            strI1 = str8;
                                                                                        }
                                                                                        listA = r27.a();
                                                                                        if ((listA instanceof Collection) || !listA.isEmpty()) {
                                                                                            for (wx.i.Image image : listA) {
                                                                                                if (!t.c(wx.j.a(image), str7) && Arrays.equals(image.getFileContent().getBytes(), bArr4)) {
                                                                                                    bVar7.b(mVar.d());
                                                                                                    throw new oq.g();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                                                                        bVar3 = bVar6;
                                                                                    } catch (ex.c e29) {
                                                                                        e = e29;
                                                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                                                    } catch (CancellationException e35) {
                                                                                        e = e35;
                                                                                        throw e;
                                                                                    } catch (Exception e36) {
                                                                                        e = e36;
                                                                                        obj = str2;
                                                                                        ?? r210 = px.f.f163100a;
                                                                                        message = e.getMessage();
                                                                                        if (message == null) {
                                                                                            r15 = obj;
                                                                                        } else {
                                                                                            r15 = message;
                                                                                        }
                                                                                        r210.d(r15, e, px.c.a(jVarA));
                                                                                        iVarA = jVarA.a(e);
                                                                                        if (iVarA instanceof dx.i.Left) {
                                                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                                        } else {
                                                                                            if (!(iVarA instanceof dx.i.Right)) {
                                                                                                throw new oq.p();
                                                                                            }
                                                                                            objB = ((dx.i.Right) iVarA).b();
                                                                                        }
                                                                                        return new dx.i.Left(objB);
                                                                                    }
                                                                                } catch (ex.c e37) {
                                                                                    e = e37;
                                                                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                                                                } catch (CancellationException e38) {
                                                                                    e = e38;
                                                                                    throw e;
                                                                                } catch (Exception e39) {
                                                                                    e = e39;
                                                                                    obj = str2;
                                                                                    jVarA = jVar3;
                                                                                    ?? r211 = px.f.f163100a;
                                                                                    message = e.getMessage();
                                                                                    if (message == null) {
                                                                                        r15 = obj;
                                                                                    } else {
                                                                                        r15 = message;
                                                                                    }
                                                                                    r211.d(r15, e, px.c.a(jVarA));
                                                                                    iVarA = jVarA.a(e);
                                                                                    if (iVarA instanceof dx.i.Left) {
                                                                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                                    } else {
                                                                                        if (!(iVarA instanceof dx.i.Right)) {
                                                                                            throw new oq.p();
                                                                                        }
                                                                                        objB = ((dx.i.Right) iVarA).b();
                                                                                    }
                                                                                    return new dx.i.Left(objB);
                                                                                }
                                                                            } catch (ex.c e45) {
                                                                                e = e45;
                                                                            } catch (CancellationException e46) {
                                                                                e = e46;
                                                                            } catch (Exception e47) {
                                                                                e = e47;
                                                                            }
                                                                        } catch (ex.c e48) {
                                                                            e = e48;
                                                                            return new dx.i.Left((dx.b) ex.d.a(e));
                                                                        } catch (CancellationException e49) {
                                                                            e = e49;
                                                                            throw e;
                                                                        } catch (Exception e55) {
                                                                            e = e55;
                                                                            obj = str2;
                                                                            ?? r212 = px.f.f163100a;
                                                                            message = e.getMessage();
                                                                            if (message == null) {
                                                                                r15 = obj;
                                                                            } else {
                                                                                r15 = message;
                                                                            }
                                                                            r212.d(r15, e, px.c.a(jVarA));
                                                                            iVarA = jVarA.a(e);
                                                                            if (iVarA instanceof dx.i.Left) {
                                                                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                            } else {
                                                                                if (!(iVarA instanceof dx.i.Right)) {
                                                                                    throw new oq.p();
                                                                                }
                                                                                objB = ((dx.i.Right) iVarA).b();
                                                                            }
                                                                            return new dx.i.Left(objB);
                                                                        }
                                                                        break;
                                                                    }
                                                                    return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                                                                }
                                                            } catch (ex.c e56) {
                                                                e = e56;
                                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                                            } catch (CancellationException e57) {
                                                                e = e57;
                                                                throw e;
                                                            } catch (Exception e58) {
                                                                e = e58;
                                                                obj = str2;
                                                                ?? r213 = px.f.f163100a;
                                                                message = e.getMessage();
                                                                if (message == null) {
                                                                    r15 = obj;
                                                                } else {
                                                                    r15 = message;
                                                                }
                                                                r213.d(r15, e, px.c.a(jVarA));
                                                                iVarA = jVarA.a(e);
                                                                if (iVarA instanceof dx.i.Left) {
                                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                                } else {
                                                                    if (!(iVarA instanceof dx.i.Right)) {
                                                                        throw new oq.p();
                                                                    }
                                                                    objB = ((dx.i.Right) iVarA).b();
                                                                }
                                                                return new dx.i.Left(objB);
                                                            }
                                                        }
                                                    } catch (ex.c e59) {
                                                        e = e59;
                                                        return new dx.i.Left((dx.b) ex.d.a(e));
                                                    } catch (CancellationException e65) {
                                                        e = e65;
                                                        throw e;
                                                    } catch (Exception e66) {
                                                        e = e66;
                                                        obj = str2;
                                                        jVarA = jVar2;
                                                        ?? r214 = px.f.f163100a;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                            r15 = obj;
                                                        } else {
                                                            r15 = message;
                                                        }
                                                        r214.d(r15, e, px.c.a(jVarA));
                                                        iVarA = jVarA.a(e);
                                                        if (iVarA instanceof dx.i.Left) {
                                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                        } else {
                                                            if (!(iVarA instanceof dx.i.Right)) {
                                                                throw new oq.p();
                                                            }
                                                            objB = ((dx.i.Right) iVarA).b();
                                                        }
                                                        return new dx.i.Left(objB);
                                                    }
                                                }
                                            } catch (ex.c e67) {
                                                e = e67;
                                                return new dx.i.Left((dx.b) ex.d.a(e));
                                            } catch (CancellationException e68) {
                                                e = e68;
                                                throw e;
                                            } catch (Exception e69) {
                                                e = e69;
                                                obj = "";
                                                jVarA = jVar;
                                                ?? r215 = px.f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    r15 = obj;
                                                } else {
                                                    r15 = message;
                                                }
                                                r215.d(r15, e, px.c.a(jVarA));
                                                iVarA = jVarA.a(e);
                                                if (iVarA instanceof dx.i.Left) {
                                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                                } else {
                                                    if (!(iVarA instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    objB = ((dx.i.Right) iVarA).b();
                                                }
                                                return new dx.i.Left(objB);
                                            }
                                        } catch (ex.c e75) {
                                            e = e75;
                                        } catch (CancellationException e76) {
                                            e = e76;
                                        } catch (Exception e77) {
                                            e = e77;
                                        }
                                        break;
                                    } catch (ex.c e78) {
                                        e = e78;
                                    } catch (CancellationException e79) {
                                        throw e79;
                                    } catch (Exception e85) {
                                        e = e85;
                                        obj = "";
                                    }
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                }
                                return objE;
                            case 1:
                                i15 = aVar.f83522v;
                                i16 = aVar.f83521t;
                                i17 = aVar.f83520s;
                                i18 = aVar.f83519r;
                                i19 = aVar.f83518q;
                                ex.b bVar9 = (ex.b) aVar.f83510g;
                                aVar2 = (ex.b) aVar.f83509f;
                                jVar3 = (dx.j) aVar.f83508e;
                                obj = (bc4.n.Params) aVar.f83507d;
                                try {
                                    u.b(objI);
                                    bVar = bVar9;
                                    jVarA = jVar3;
                                    eVar2 = (zz.e) objI;
                                    if (!t.c(eVar2, zz.e.a.f238544a)) {
                                        bVar.b(h());
                                        throw new oq.g();
                                    }
                                    if (eVar2 instanceof zz.e.UriResult) {
                                        throw new oq.p();
                                    }
                                    if (((zz.e.UriResult) eVar2).getUri() != null) {
                                        bVar.b(g());
                                        throw new oq.g();
                                    }
                                    strValueOf = String.valueOf(((zz.e.UriResult) eVar2).getUri());
                                    az.f fVar4 = this.fileDataManager;
                                    aVar.f83507d = obj;
                                    aVar.f83508e = jVarA;
                                    jVar = jVarA;
                                    aVar.f83509f = vq.j.a(aVar2);
                                    aVar.f83510g = bVar;
                                    aVar.f83511h = strValueOf;
                                    aVar.f83512j = vq.j.a(eVar2);
                                    aVar.f83518q = i19;
                                    aVar.f83519r = i18;
                                    aVar.f83520s = i17;
                                    aVar.f83521t = i16;
                                    aVar.f83522v = i15;
                                    aVar.B = 2;
                                    objK = fVar4.k(strValueOf, aVar);
                                    if (objK != objE) {
                                        r16 = obj;
                                        bVar2 = aVar2;
                                        eVar3 = eVar2;
                                        objI = objK;
                                        i25 = i19;
                                        i26 = i18;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = i15;
                                        str = strValueOf;
                                        jVar2 = jVar;
                                        f15 = (Float) objI;
                                        if (f15 == null) {
                                            obj = "";
                                            bVar.b(h());
                                            throw new oq.g();
                                        }
                                        fFloatValue = f15.floatValue();
                                        maxPhotoSizeInBytes = r16.getMaxPhotoSizeInBytes();
                                        if (maxPhotoSizeInBytes != null) {
                                            str2 = "";
                                            bVar.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                                            i0 i0Var2 = i0.f148189a;
                                        } else {
                                            str2 = "";
                                        }
                                        xx.a aVar4 = this.exifDataManager;
                                        aVar.f83507d = r16;
                                        aVar.f83508e = jVar2;
                                        aVar.f83509f = vq.j.a(bVar2);
                                        aVar.f83510g = bVar;
                                        aVar.f83511h = str;
                                        aVar.f83512j = vq.j.a(eVar3);
                                        aVar.f83518q = i25;
                                        aVar.f83519r = i26;
                                        aVar.f83520s = i27;
                                        aVar.f83521t = i28;
                                        aVar.f83522v = i29;
                                        aVar.f83525y = fFloatValue;
                                        aVar.B = 3;
                                        objB2 = aVar4.b(str, aVar);
                                        if (objB2 != objE) {
                                            int i67 = i29;
                                            f16 = fFloatValue;
                                            objI = objB2;
                                            i35 = i67;
                                            ?? r111 = r16;
                                            str3 = str;
                                            r17 = r111;
                                            i36 = i25;
                                            jVarA = jVar2;
                                            bVar3 = bVar;
                                            eVar4 = eVar3;
                                            num = (Integer) objI;
                                            az.f fVar5 = this.fileDataManager;
                                            aVar.f83507d = r17;
                                            aVar.f83508e = jVarA;
                                            r19 = r17;
                                            aVar.f83509f = vq.j.a(bVar2);
                                            aVar.f83510g = bVar3;
                                            aVar.f83511h = str3;
                                            aVar.f83512j = bVar3;
                                            aVar.f83513k = num;
                                            aVar.f83514l = vq.j.a(eVar4);
                                            aVar.f83518q = i36;
                                            aVar.f83519r = i26;
                                            aVar.f83520s = i27;
                                            aVar.f83521t = i28;
                                            aVar.f83522v = i35;
                                            aVar.f83525y = f16;
                                            aVar.B = 4;
                                            objM = fVar5.m(str3, aVar);
                                            if (objM != objE) {
                                                num2 = num;
                                                objI = objM;
                                                i37 = i36;
                                                str4 = str3;
                                                i38 = i27;
                                                eVar5 = eVar4;
                                                i39 = i28;
                                                i45 = i26;
                                                bVar4 = bVar3;
                                                i46 = i35;
                                                f17 = f16;
                                                r18 = r19;
                                                right = (dx.i) objI;
                                                eVar6 = eVar5;
                                                if (!(right instanceof dx.i.Left)) {
                                                    if (!(right instanceof dx.i.Right)) {
                                                        throw new oq.p();
                                                    }
                                                    bArr = (byte[]) ((dx.i.Right) right).b();
                                                    bc4.o oVar2 = this.rotateImageUC;
                                                    if (num2 != null) {
                                                        iIntValue = num2.intValue();
                                                    } else {
                                                        iIntValue = 0;
                                                    }
                                                    bc4.o.Params params3 = new bc4.o.Params(iIntValue, bArr);
                                                    aVar.f83507d = r18;
                                                    aVar.f83508e = jVarA;
                                                    aVar.f83509f = vq.j.a(bVar2);
                                                    aVar.f83510g = bVar4;
                                                    aVar.f83511h = str4;
                                                    aVar.f83512j = bVar3;
                                                    aVar.f83513k = vq.j.a(num2);
                                                    aVar.f83514l = vq.j.a(right);
                                                    aVar.f83515m = bArr;
                                                    aVar.f83516n = vq.j.a(eVar6);
                                                    aVar.f83518q = i37;
                                                    aVar.f83519r = i45;
                                                    aVar.f83520s = i38;
                                                    aVar.f83521t = i39;
                                                    aVar.f83522v = i46;
                                                    aVar.f83525y = f17;
                                                    aVar.f83523w = 0;
                                                    aVar.f83524x = 0;
                                                    aVar.B = 5;
                                                    objC = oVar2.c(params3, aVar);
                                                    objE = objE;
                                                    if (objC == objE) {
                                                        return objE;
                                                    }
                                                    num3 = num2;
                                                    iVar = right;
                                                    objI = objC;
                                                    bArr2 = bArr;
                                                    i47 = 0;
                                                    i48 = i45;
                                                    jVar3 = jVarA;
                                                    bVar5 = bVar4;
                                                    bVar6 = bVar3;
                                                    i49 = i38;
                                                    i55 = i46;
                                                    str5 = str4;
                                                    r25 = r18;
                                                    i56 = i37;
                                                    i57 = i39;
                                                    i58 = 0;
                                                    bArr3 = (byte[]) ((dx.i) objI).a();
                                                    if (bArr3 == null) {
                                                        bArr3 = bArr2;
                                                    }
                                                    obj2 = objE;
                                                    int i68 = i58;
                                                    mVar = this;
                                                    az.f fVar6 = mVar.fileDataManager;
                                                    aVar.f83507d = r25;
                                                    aVar.f83508e = jVar3;
                                                    r26 = r25;
                                                    aVar.f83509f = vq.j.a(bVar2);
                                                    aVar.f83510g = bVar5;
                                                    aVar.f83511h = str5;
                                                    aVar.f83512j = bVar6;
                                                    aVar.f83513k = vq.j.a(num3);
                                                    aVar.f83514l = vq.j.a(iVar);
                                                    aVar.f83515m = vq.j.a(bArr2);
                                                    aVar.f83516n = bArr3;
                                                    aVar.f83517p = vq.j.a(eVar6);
                                                    aVar.f83518q = i56;
                                                    aVar.f83519r = i48;
                                                    aVar.f83520s = i49;
                                                    aVar.f83521t = i57;
                                                    aVar.f83522v = i55;
                                                    aVar.f83525y = f17;
                                                    aVar.f83523w = i47;
                                                    aVar.f83524x = i68;
                                                    aVar.B = 6;
                                                    objF = fVar6.f(str5, aVar);
                                                    if (objF == obj2) {
                                                        return obj2;
                                                    }
                                                    bArr4 = bArr3;
                                                    objI = objF;
                                                    str6 = str5;
                                                    bVar7 = bVar5;
                                                    jVarA = jVar3;
                                                    r27 = r26;
                                                    str7 = (String) objI;
                                                    strI1 = null;
                                                    if (str7 != null) {
                                                        text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                                    } else {
                                                        text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                                    }
                                                    if (str7 != null) {
                                                        str8 = str2;
                                                        strI1 = r.i1(str7, ".", str8);
                                                    } else {
                                                        str8 = str2;
                                                    }
                                                    if (strI1 == null) {
                                                        strI1 = str8;
                                                    }
                                                    listA = r27.a();
                                                    if (listA instanceof Collection) {
                                                        while (r1.hasNext()) {
                                                            if (!t.c(wx.j.a(image), str7)) {
                                                                bVar7.b(mVar.d());
                                                                throw new oq.g();
                                                            }
                                                        }
                                                    } else {
                                                        while (r1.hasNext()) {
                                                            if (!t.c(wx.j.a(image), str7)) {
                                                                bVar7.b(mVar.d());
                                                                throw new oq.g();
                                                            }
                                                        }
                                                    }
                                                    right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                                    bVar3 = bVar6;
                                                }
                                                return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                                            }
                                        }
                                        break;
                                    }
                                    return objE;
                                } catch (ex.c e86) {
                                    e = e86;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e87) {
                                    e = e87;
                                    throw e;
                                } catch (Exception e88) {
                                    e = e88;
                                    obj = "";
                                    jVarA = jVar3;
                                    ?? r216 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        r15 = obj;
                                    } else {
                                        r15 = message;
                                    }
                                    r216.d(r15, e, px.c.a(jVarA));
                                    iVarA = jVarA.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            case 2:
                                int i69 = aVar.f83522v;
                                int i75 = aVar.f83521t;
                                int i76 = aVar.f83520s;
                                int i77 = aVar.f83519r;
                                int i78 = aVar.f83518q;
                                zz.e eVar7 = (zz.e) aVar.f83512j;
                                String str9 = (String) aVar.f83511h;
                                bVar = (ex.b) aVar.f83510g;
                                bVar2 = (ex.b) aVar.f83509f;
                                jVar2 = (dx.j) aVar.f83508e;
                                bc4.n.Params params4 = (bc4.n.Params) aVar.f83507d;
                                try {
                                    u.b(objI);
                                    i29 = i69;
                                    str = str9;
                                    eVar3 = eVar7;
                                    i25 = i78;
                                    i26 = i77;
                                    i27 = i76;
                                    i28 = i75;
                                    r16 = params4;
                                    f15 = (Float) objI;
                                    if (f15 == null) {
                                        obj = "";
                                        bVar.b(h());
                                        throw new oq.g();
                                    }
                                    fFloatValue = f15.floatValue();
                                    maxPhotoSizeInBytes = r16.getMaxPhotoSizeInBytes();
                                    if (maxPhotoSizeInBytes != null) {
                                        str2 = "";
                                        bVar.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                                        i0 i0Var3 = i0.f148189a;
                                        break;
                                    } else {
                                        str2 = "";
                                    }
                                    xx.a aVar5 = this.exifDataManager;
                                    aVar.f83507d = r16;
                                    aVar.f83508e = jVar2;
                                    aVar.f83509f = vq.j.a(bVar2);
                                    aVar.f83510g = bVar;
                                    aVar.f83511h = str;
                                    aVar.f83512j = vq.j.a(eVar3);
                                    aVar.f83518q = i25;
                                    aVar.f83519r = i26;
                                    aVar.f83520s = i27;
                                    aVar.f83521t = i28;
                                    aVar.f83522v = i29;
                                    aVar.f83525y = fFloatValue;
                                    aVar.B = 3;
                                    objB2 = aVar5.b(str, aVar);
                                    if (objB2 != objE) {
                                        int i610 = i29;
                                        f16 = fFloatValue;
                                        objI = objB2;
                                        i35 = i610;
                                        ?? r112 = r16;
                                        str3 = str;
                                        r17 = r112;
                                        i36 = i25;
                                        jVarA = jVar2;
                                        bVar3 = bVar;
                                        eVar4 = eVar3;
                                        num = (Integer) objI;
                                        az.f fVar7 = this.fileDataManager;
                                        aVar.f83507d = r17;
                                        aVar.f83508e = jVarA;
                                        r19 = r17;
                                        aVar.f83509f = vq.j.a(bVar2);
                                        aVar.f83510g = bVar3;
                                        aVar.f83511h = str3;
                                        aVar.f83512j = bVar3;
                                        aVar.f83513k = num;
                                        aVar.f83514l = vq.j.a(eVar4);
                                        aVar.f83518q = i36;
                                        aVar.f83519r = i26;
                                        aVar.f83520s = i27;
                                        aVar.f83521t = i28;
                                        aVar.f83522v = i35;
                                        aVar.f83525y = f16;
                                        aVar.B = 4;
                                        objM = fVar7.m(str3, aVar);
                                        if (objM != objE) {
                                            num2 = num;
                                            objI = objM;
                                            i37 = i36;
                                            str4 = str3;
                                            i38 = i27;
                                            eVar5 = eVar4;
                                            i39 = i28;
                                            i45 = i26;
                                            bVar4 = bVar3;
                                            i46 = i35;
                                            f17 = f16;
                                            r18 = r19;
                                            right = (dx.i) objI;
                                            eVar6 = eVar5;
                                            if (!(right instanceof dx.i.Left)) {
                                                if (!(right instanceof dx.i.Right)) {
                                                    throw new oq.p();
                                                }
                                                bArr = (byte[]) ((dx.i.Right) right).b();
                                                bc4.o oVar3 = this.rotateImageUC;
                                                if (num2 != null) {
                                                    iIntValue = num2.intValue();
                                                } else {
                                                    iIntValue = 0;
                                                }
                                                bc4.o.Params params5 = new bc4.o.Params(iIntValue, bArr);
                                                aVar.f83507d = r18;
                                                aVar.f83508e = jVarA;
                                                aVar.f83509f = vq.j.a(bVar2);
                                                aVar.f83510g = bVar4;
                                                aVar.f83511h = str4;
                                                aVar.f83512j = bVar3;
                                                aVar.f83513k = vq.j.a(num2);
                                                aVar.f83514l = vq.j.a(right);
                                                aVar.f83515m = bArr;
                                                aVar.f83516n = vq.j.a(eVar6);
                                                aVar.f83518q = i37;
                                                aVar.f83519r = i45;
                                                aVar.f83520s = i38;
                                                aVar.f83521t = i39;
                                                aVar.f83522v = i46;
                                                aVar.f83525y = f17;
                                                aVar.f83523w = 0;
                                                aVar.f83524x = 0;
                                                aVar.B = 5;
                                                objC = oVar3.c(params5, aVar);
                                                objE = objE;
                                                if (objC == objE) {
                                                    return objE;
                                                }
                                                num3 = num2;
                                                iVar = right;
                                                objI = objC;
                                                bArr2 = bArr;
                                                i47 = 0;
                                                i48 = i45;
                                                jVar3 = jVarA;
                                                bVar5 = bVar4;
                                                bVar6 = bVar3;
                                                i49 = i38;
                                                i55 = i46;
                                                str5 = str4;
                                                r25 = r18;
                                                i56 = i37;
                                                i57 = i39;
                                                i58 = 0;
                                                bArr3 = (byte[]) ((dx.i) objI).a();
                                                if (bArr3 == null) {
                                                    bArr3 = bArr2;
                                                }
                                                obj2 = objE;
                                                int i611 = i58;
                                                mVar = this;
                                                az.f fVar8 = mVar.fileDataManager;
                                                aVar.f83507d = r25;
                                                aVar.f83508e = jVar3;
                                                r26 = r25;
                                                aVar.f83509f = vq.j.a(bVar2);
                                                aVar.f83510g = bVar5;
                                                aVar.f83511h = str5;
                                                aVar.f83512j = bVar6;
                                                aVar.f83513k = vq.j.a(num3);
                                                aVar.f83514l = vq.j.a(iVar);
                                                aVar.f83515m = vq.j.a(bArr2);
                                                aVar.f83516n = bArr3;
                                                aVar.f83517p = vq.j.a(eVar6);
                                                aVar.f83518q = i56;
                                                aVar.f83519r = i48;
                                                aVar.f83520s = i49;
                                                aVar.f83521t = i57;
                                                aVar.f83522v = i55;
                                                aVar.f83525y = f17;
                                                aVar.f83523w = i47;
                                                aVar.f83524x = i611;
                                                aVar.B = 6;
                                                objF = fVar8.f(str5, aVar);
                                                if (objF == obj2) {
                                                    return obj2;
                                                }
                                                bArr4 = bArr3;
                                                objI = objF;
                                                str6 = str5;
                                                bVar7 = bVar5;
                                                jVarA = jVar3;
                                                r27 = r26;
                                                str7 = (String) objI;
                                                strI1 = null;
                                                if (str7 != null) {
                                                    text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                                } else {
                                                    text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                                }
                                                if (str7 != null) {
                                                    str8 = str2;
                                                    strI1 = r.i1(str7, ".", str8);
                                                } else {
                                                    str8 = str2;
                                                }
                                                if (strI1 == null) {
                                                    strI1 = str8;
                                                }
                                                listA = r27.a();
                                                if (listA instanceof Collection) {
                                                    while (r1.hasNext()) {
                                                        if (!t.c(wx.j.a(image), str7)) {
                                                            bVar7.b(mVar.d());
                                                            throw new oq.g();
                                                        }
                                                    }
                                                } else {
                                                    while (r1.hasNext()) {
                                                        if (!t.c(wx.j.a(image), str7)) {
                                                            bVar7.b(mVar.d());
                                                            throw new oq.g();
                                                        }
                                                    }
                                                }
                                                right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                                bVar3 = bVar6;
                                            }
                                            return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                                        }
                                    }
                                    return objE;
                                } catch (ex.c e89) {
                                    e = e89;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e95) {
                                    e = e95;
                                    throw e;
                                } catch (Exception e96) {
                                    e = e96;
                                    obj = "";
                                    jVarA = jVar2;
                                    ?? r217 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        r15 = obj;
                                    } else {
                                        r15 = message;
                                    }
                                    r217.d(r15, e, px.c.a(jVarA));
                                    iVarA = jVarA.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                            case 3:
                                float f18 = aVar.f83525y;
                                int i79 = aVar.f83522v;
                                i28 = aVar.f83521t;
                                i27 = aVar.f83520s;
                                i26 = aVar.f83519r;
                                int i85 = aVar.f83518q;
                                zz.e eVar8 = (zz.e) aVar.f83512j;
                                String str10 = (String) aVar.f83511h;
                                ex.b bVar10 = (ex.b) aVar.f83510g;
                                ex.b bVar11 = (ex.b) aVar.f83509f;
                                dx.j<dx.b> jVar4 = (dx.j) aVar.f83508e;
                                bc4.n.Params params6 = (bc4.n.Params) aVar.f83507d;
                                try {
                                    u.b(objI);
                                    i36 = i85;
                                    jVarA = jVar4;
                                    str3 = str10;
                                    eVar4 = eVar8;
                                    str2 = "";
                                    i35 = i79;
                                    f16 = f18;
                                    bVar2 = bVar11;
                                    bVar3 = bVar10;
                                    r17 = params6;
                                    num = (Integer) objI;
                                    az.f fVar9 = this.fileDataManager;
                                    aVar.f83507d = r17;
                                    aVar.f83508e = jVarA;
                                    r19 = r17;
                                    aVar.f83509f = vq.j.a(bVar2);
                                    aVar.f83510g = bVar3;
                                    aVar.f83511h = str3;
                                    aVar.f83512j = bVar3;
                                    aVar.f83513k = num;
                                    aVar.f83514l = vq.j.a(eVar4);
                                    aVar.f83518q = i36;
                                    aVar.f83519r = i26;
                                    aVar.f83520s = i27;
                                    aVar.f83521t = i28;
                                    aVar.f83522v = i35;
                                    aVar.f83525y = f16;
                                    aVar.B = 4;
                                    objM = fVar9.m(str3, aVar);
                                    if (objM != objE) {
                                        return objE;
                                    }
                                    num2 = num;
                                    objI = objM;
                                    i37 = i36;
                                    str4 = str3;
                                    i38 = i27;
                                    eVar5 = eVar4;
                                    i39 = i28;
                                    i45 = i26;
                                    bVar4 = bVar3;
                                    i46 = i35;
                                    f17 = f16;
                                    r18 = r19;
                                    right = (dx.i) objI;
                                    eVar6 = eVar5;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (!(right instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        bArr = (byte[]) ((dx.i.Right) right).b();
                                        bc4.o oVar4 = this.rotateImageUC;
                                        if (num2 != null) {
                                            iIntValue = num2.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        bc4.o.Params params7 = new bc4.o.Params(iIntValue, bArr);
                                        aVar.f83507d = r18;
                                        aVar.f83508e = jVarA;
                                        aVar.f83509f = vq.j.a(bVar2);
                                        aVar.f83510g = bVar4;
                                        aVar.f83511h = str4;
                                        aVar.f83512j = bVar3;
                                        aVar.f83513k = vq.j.a(num2);
                                        aVar.f83514l = vq.j.a(right);
                                        aVar.f83515m = bArr;
                                        aVar.f83516n = vq.j.a(eVar6);
                                        aVar.f83518q = i37;
                                        aVar.f83519r = i45;
                                        aVar.f83520s = i38;
                                        aVar.f83521t = i39;
                                        aVar.f83522v = i46;
                                        aVar.f83525y = f17;
                                        aVar.f83523w = 0;
                                        aVar.f83524x = 0;
                                        aVar.B = 5;
                                        objC = oVar4.c(params7, aVar);
                                        objE = objE;
                                        if (objC == objE) {
                                            return objE;
                                        }
                                        num3 = num2;
                                        iVar = right;
                                        objI = objC;
                                        bArr2 = bArr;
                                        i47 = 0;
                                        i48 = i45;
                                        jVar3 = jVarA;
                                        bVar5 = bVar4;
                                        bVar6 = bVar3;
                                        i49 = i38;
                                        i55 = i46;
                                        str5 = str4;
                                        r25 = r18;
                                        i56 = i37;
                                        i57 = i39;
                                        i58 = 0;
                                        bArr3 = (byte[]) ((dx.i) objI).a();
                                        if (bArr3 == null) {
                                            bArr3 = bArr2;
                                        }
                                        obj2 = objE;
                                        int i612 = i58;
                                        mVar = this;
                                        az.f fVar10 = mVar.fileDataManager;
                                        aVar.f83507d = r25;
                                        aVar.f83508e = jVar3;
                                        r26 = r25;
                                        aVar.f83509f = vq.j.a(bVar2);
                                        aVar.f83510g = bVar5;
                                        aVar.f83511h = str5;
                                        aVar.f83512j = bVar6;
                                        aVar.f83513k = vq.j.a(num3);
                                        aVar.f83514l = vq.j.a(iVar);
                                        aVar.f83515m = vq.j.a(bArr2);
                                        aVar.f83516n = bArr3;
                                        aVar.f83517p = vq.j.a(eVar6);
                                        aVar.f83518q = i56;
                                        aVar.f83519r = i48;
                                        aVar.f83520s = i49;
                                        aVar.f83521t = i57;
                                        aVar.f83522v = i55;
                                        aVar.f83525y = f17;
                                        aVar.f83523w = i47;
                                        aVar.f83524x = i612;
                                        aVar.B = 6;
                                        objF = fVar10.f(str5, aVar);
                                        if (objF == obj2) {
                                            return obj2;
                                        }
                                        bArr4 = bArr3;
                                        objI = objF;
                                        str6 = str5;
                                        bVar7 = bVar5;
                                        jVarA = jVar3;
                                        r27 = r26;
                                        str7 = (String) objI;
                                        strI1 = null;
                                        if (str7 != null) {
                                            text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                        } else {
                                            text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                        }
                                        if (str7 != null) {
                                            str8 = str2;
                                            strI1 = r.i1(str7, ".", str8);
                                        } else {
                                            str8 = str2;
                                        }
                                        if (strI1 == null) {
                                            strI1 = str8;
                                        }
                                        listA = r27.a();
                                        if (listA instanceof Collection) {
                                            while (r1.hasNext()) {
                                                if (!t.c(wx.j.a(image), str7)) {
                                                    bVar7.b(mVar.d());
                                                    throw new oq.g();
                                                }
                                            }
                                        } else {
                                            while (r1.hasNext()) {
                                                if (!t.c(wx.j.a(image), str7)) {
                                                    bVar7.b(mVar.d());
                                                    throw new oq.g();
                                                }
                                            }
                                        }
                                        right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                        bVar3 = bVar6;
                                    }
                                    return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                                } catch (ex.c e97) {
                                    e = e97;
                                } catch (CancellationException e98) {
                                    throw e98;
                                } catch (Exception e99) {
                                    e = e99;
                                    obj = "";
                                    jVarA = jVar4;
                                    ?? r218 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        r15 = obj;
                                    } else {
                                        r15 = message;
                                    }
                                    r218.d(r15, e, px.c.a(jVarA));
                                    iVarA = jVarA.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                                break;
                            case 4:
                                float f19 = aVar.f83525y;
                                int i86 = aVar.f83522v;
                                i39 = aVar.f83521t;
                                int i87 = aVar.f83520s;
                                int i88 = aVar.f83519r;
                                int i89 = aVar.f83518q;
                                zz.e eVar9 = (zz.e) aVar.f83514l;
                                Integer num4 = (Integer) aVar.f83513k;
                                bVar3 = (ex.b) aVar.f83512j;
                                String str11 = (String) aVar.f83511h;
                                bVar4 = (ex.b) aVar.f83510g;
                                ex.b bVar12 = (ex.b) aVar.f83509f;
                                dx.j<dx.b> jVar5 = (dx.j) aVar.f83508e;
                                bc4.n.Params params8 = (bc4.n.Params) aVar.f83507d;
                                try {
                                    u.b(objI);
                                    bVar2 = bVar12;
                                    num2 = num4;
                                    i37 = i89;
                                    i38 = i87;
                                    i46 = i86;
                                    r18 = params8;
                                    str4 = str11;
                                    eVar5 = eVar9;
                                    i45 = i88;
                                    jVarA = jVar5;
                                    str2 = "";
                                    f17 = f19;
                                    right = (dx.i) objI;
                                    eVar6 = eVar5;
                                    if (!(right instanceof dx.i.Left)) {
                                        if (!(right instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        bArr = (byte[]) ((dx.i.Right) right).b();
                                        bc4.o oVar5 = this.rotateImageUC;
                                        if (num2 != null) {
                                            iIntValue = num2.intValue();
                                        } else {
                                            iIntValue = 0;
                                        }
                                        bc4.o.Params params9 = new bc4.o.Params(iIntValue, bArr);
                                        aVar.f83507d = r18;
                                        aVar.f83508e = jVarA;
                                        aVar.f83509f = vq.j.a(bVar2);
                                        aVar.f83510g = bVar4;
                                        aVar.f83511h = str4;
                                        aVar.f83512j = bVar3;
                                        aVar.f83513k = vq.j.a(num2);
                                        aVar.f83514l = vq.j.a(right);
                                        aVar.f83515m = bArr;
                                        aVar.f83516n = vq.j.a(eVar6);
                                        aVar.f83518q = i37;
                                        aVar.f83519r = i45;
                                        aVar.f83520s = i38;
                                        aVar.f83521t = i39;
                                        aVar.f83522v = i46;
                                        aVar.f83525y = f17;
                                        aVar.f83523w = 0;
                                        aVar.f83524x = 0;
                                        aVar.B = 5;
                                        objC = oVar5.c(params9, aVar);
                                        objE = objE;
                                        if (objC == objE) {
                                            return objE;
                                        }
                                        num3 = num2;
                                        iVar = right;
                                        objI = objC;
                                        bArr2 = bArr;
                                        i47 = 0;
                                        i48 = i45;
                                        jVar3 = jVarA;
                                        bVar5 = bVar4;
                                        bVar6 = bVar3;
                                        i49 = i38;
                                        i55 = i46;
                                        str5 = str4;
                                        r25 = r18;
                                        i56 = i37;
                                        i57 = i39;
                                        i58 = 0;
                                        bArr3 = (byte[]) ((dx.i) objI).a();
                                        if (bArr3 == null) {
                                            bArr3 = bArr2;
                                        }
                                        obj2 = objE;
                                        int i613 = i58;
                                        mVar = this;
                                        az.f fVar11 = mVar.fileDataManager;
                                        aVar.f83507d = r25;
                                        aVar.f83508e = jVar3;
                                        r26 = r25;
                                        aVar.f83509f = vq.j.a(bVar2);
                                        aVar.f83510g = bVar5;
                                        aVar.f83511h = str5;
                                        aVar.f83512j = bVar6;
                                        aVar.f83513k = vq.j.a(num3);
                                        aVar.f83514l = vq.j.a(iVar);
                                        aVar.f83515m = vq.j.a(bArr2);
                                        aVar.f83516n = bArr3;
                                        aVar.f83517p = vq.j.a(eVar6);
                                        aVar.f83518q = i56;
                                        aVar.f83519r = i48;
                                        aVar.f83520s = i49;
                                        aVar.f83521t = i57;
                                        aVar.f83522v = i55;
                                        aVar.f83525y = f17;
                                        aVar.f83523w = i47;
                                        aVar.f83524x = i613;
                                        aVar.B = 6;
                                        objF = fVar11.f(str5, aVar);
                                        if (objF == obj2) {
                                            return obj2;
                                        }
                                        bArr4 = bArr3;
                                        objI = objF;
                                        str6 = str5;
                                        bVar7 = bVar5;
                                        jVarA = jVar3;
                                        r27 = r26;
                                        str7 = (String) objI;
                                        strI1 = null;
                                        if (str7 != null) {
                                            text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                        } else {
                                            text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                        }
                                        if (str7 != null) {
                                            str8 = str2;
                                            strI1 = r.i1(str7, ".", str8);
                                        } else {
                                            str8 = str2;
                                        }
                                        if (strI1 == null) {
                                            strI1 = str8;
                                        }
                                        listA = r27.a();
                                        if (listA instanceof Collection) {
                                            while (r1.hasNext()) {
                                                if (!t.c(wx.j.a(image), str7)) {
                                                    bVar7.b(mVar.d());
                                                    throw new oq.g();
                                                }
                                            }
                                        } else {
                                            while (r1.hasNext()) {
                                                if (!t.c(wx.j.a(image), str7)) {
                                                    bVar7.b(mVar.d());
                                                    throw new oq.g();
                                                }
                                            }
                                        }
                                        right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                        bVar3 = bVar6;
                                    }
                                    return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                                } catch (ex.c e100) {
                                    e = e100;
                                } catch (CancellationException e101) {
                                    throw e101;
                                } catch (Exception e102) {
                                    e = e102;
                                    obj = "";
                                    jVarA = jVar5;
                                    ?? r219 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        r15 = obj;
                                    } else {
                                        r15 = message;
                                    }
                                    r219.d(r15, e, px.c.a(jVarA));
                                    iVarA = jVarA.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                                break;
                            case 5:
                                int i95 = aVar.f83524x;
                                int i96 = aVar.f83523w;
                                float f25 = aVar.f83525y;
                                int i97 = aVar.f83522v;
                                int i98 = aVar.f83521t;
                                int i99 = aVar.f83520s;
                                int i100 = aVar.f83519r;
                                int i101 = aVar.f83518q;
                                zz.e eVar10 = (zz.e) aVar.f83516n;
                                byte[] bArr5 = (byte[]) aVar.f83515m;
                                dx.i iVar2 = (dx.i) aVar.f83514l;
                                num3 = (Integer) aVar.f83513k;
                                ex.b bVar13 = (ex.b) aVar.f83512j;
                                String str12 = (String) aVar.f83511h;
                                ex.b bVar14 = (ex.b) aVar.f83510g;
                                ex.b bVar15 = (ex.b) aVar.f83509f;
                                dx.j<dx.b> jVar6 = (dx.j) aVar.f83508e;
                                bc4.n.Params params10 = (bc4.n.Params) aVar.f83507d;
                                try {
                                    u.b(objI);
                                    i47 = i96;
                                    iVar = iVar2;
                                    i56 = i101;
                                    i57 = i98;
                                    bVar5 = bVar14;
                                    eVar6 = eVar10;
                                    i49 = i99;
                                    i55 = i97;
                                    str5 = str12;
                                    str2 = "";
                                    f17 = f25;
                                    i58 = i95;
                                    bVar6 = bVar13;
                                    bVar2 = bVar15;
                                    bArr2 = bArr5;
                                    i48 = i100;
                                    jVar3 = jVar6;
                                    r25 = params10;
                                    bArr3 = (byte[]) ((dx.i) objI).a();
                                    if (bArr3 == null) {
                                        bArr3 = bArr2;
                                    }
                                    obj2 = objE;
                                    int i614 = i58;
                                    mVar = this;
                                    az.f fVar12 = mVar.fileDataManager;
                                    aVar.f83507d = r25;
                                    aVar.f83508e = jVar3;
                                    r26 = r25;
                                    aVar.f83509f = vq.j.a(bVar2);
                                    aVar.f83510g = bVar5;
                                    aVar.f83511h = str5;
                                    aVar.f83512j = bVar6;
                                    aVar.f83513k = vq.j.a(num3);
                                    aVar.f83514l = vq.j.a(iVar);
                                    aVar.f83515m = vq.j.a(bArr2);
                                    aVar.f83516n = bArr3;
                                    aVar.f83517p = vq.j.a(eVar6);
                                    aVar.f83518q = i56;
                                    aVar.f83519r = i48;
                                    aVar.f83520s = i49;
                                    aVar.f83521t = i57;
                                    aVar.f83522v = i55;
                                    aVar.f83525y = f17;
                                    aVar.f83523w = i47;
                                    aVar.f83524x = i614;
                                    aVar.B = 6;
                                    objF = fVar12.f(str5, aVar);
                                    if (objF == obj2) {
                                        return obj2;
                                    }
                                    bArr4 = bArr3;
                                    objI = objF;
                                    str6 = str5;
                                    bVar7 = bVar5;
                                    jVarA = jVar3;
                                    r27 = r26;
                                    str7 = (String) objI;
                                    strI1 = null;
                                    if (str7 != null) {
                                        text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                        break;
                                    } else {
                                        text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                        break;
                                    }
                                    if (str7 != null) {
                                        str8 = str2;
                                        strI1 = r.i1(str7, ".", str8);
                                    } else {
                                        str8 = str2;
                                    }
                                    if (strI1 == null) {
                                        strI1 = str8;
                                    }
                                    listA = r27.a();
                                    if (listA instanceof Collection) {
                                        while (r1.hasNext()) {
                                            if (!t.c(wx.j.a(image), str7)) {
                                                bVar7.b(mVar.d());
                                                throw new oq.g();
                                            }
                                        }
                                    } else {
                                        while (r1.hasNext()) {
                                            if (!t.c(wx.j.a(image), str7)) {
                                                bVar7.b(mVar.d());
                                                throw new oq.g();
                                            }
                                        }
                                    }
                                    right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                    bVar3 = bVar6;
                                    return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                                } catch (ex.c e103) {
                                    e = e103;
                                } catch (CancellationException e104) {
                                    throw e104;
                                } catch (Exception e105) {
                                    e = e105;
                                    obj = "";
                                    jVarA = jVar6;
                                    ?? r2110 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        r15 = obj;
                                    } else {
                                        r15 = message;
                                    }
                                    r2110.d(r15, e, px.c.a(jVarA));
                                    iVarA = jVarA.a(e);
                                    if (iVarA instanceof dx.i.Left) {
                                        objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof dx.i.Right)) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVarA).b();
                                    }
                                    return new dx.i.Left(objB);
                                }
                                break;
                            case 6:
                                float f26 = aVar.f83525y;
                                bArr4 = (byte[]) aVar.f83516n;
                                bVar6 = (ex.b) aVar.f83512j;
                                str6 = (String) aVar.f83511h;
                                bVar7 = (ex.b) aVar.f83510g;
                                jVarA = (dx.j) aVar.f83508e;
                                bc4.n.Params params11 = (bc4.n.Params) aVar.f83507d;
                                u.b(objI);
                                str2 = "";
                                f17 = f26;
                                mVar = this;
                                r27 = params11;
                                str7 = (String) objI;
                                strI1 = null;
                                if (str7 != null) {
                                    text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                    break;
                                } else {
                                    text = mVar.labelProvider.c(xb4.a.f217918p).getText();
                                    break;
                                }
                                if (str7 != null) {
                                    str8 = str2;
                                    strI1 = r.i1(str7, ".", str8);
                                } else {
                                    str8 = str2;
                                }
                                if (strI1 == null) {
                                    strI1 = str8;
                                }
                                listA = r27.a();
                                if (listA instanceof Collection) {
                                    while (r1.hasNext()) {
                                        if (!t.c(wx.j.a(image), str7)) {
                                            bVar7.b(mVar.d());
                                            throw new oq.g();
                                        }
                                    }
                                } else {
                                    while (r1.hasNext()) {
                                        if (!t.c(wx.j.a(image), str7)) {
                                            bVar7.b(mVar.d());
                                            throw new oq.g();
                                        }
                                    }
                                }
                                right = new dx.i.Right(new bc4.n.Result(new wx.i.Image(new FilePickerMetadata(text, strI1, f17, str6), new FileContent(bArr4))));
                                bVar3 = bVar6;
                                return new dx.i.Right((bc4.n.Result) bVar3.a(right));
                            default:
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } catch (Exception e106) {
                        e = e106;
                    }
                } catch (CancellationException e107) {
                    throw e107;
                }
            } catch (ex.c e108) {
                e = e108;
            } catch (CancellationException e109) {
                throw e109;
            }
        } catch (ex.c e110) {
            e = e110;
        } catch (CancellationException e111) {
            throw e111;
        } catch (Exception e112) {
            e = e112;
            obj = "";
        }
    }
}
