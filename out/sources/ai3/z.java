package ai3;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.FileImageConfiguration;
import tv0.YourDetails;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B³\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J,\u0010;\u001a\b\u0012\u0004\u0012\u0002080:2\u0006\u00106\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0082@¢\u0006\u0004\b;\u0010<J\u0018\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\bB\u0010AJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ*\u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020?0K2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0HH\u0082@¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u001c\u0010S\u001a\u00020?*\u00020L2\u0006\u0010R\u001a\u00020EH\u0082@¢\u0006\u0004\bS\u0010TJ\u0013\u0010V\u001a\u00020U*\u00020\u0002H\u0002¢\u0006\u0004\bV\u0010WR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0089\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0084\u00018\u0014X\u0094\u0004¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R'\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R%\u00109\u001a\t\u0012\u0004\u0012\u00020U0\u0091\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0096\u0001"}, d2 = {"Lai3/z;", "Ll00/g;", "Lai3/b;", "Lai3/a;", "Lai3/c;", "", "Lyy/a;", "stateMachineFactory", "Lci3/i;", "mapper", "Lbc4/n;", "pickPhotoFromGalleryUseCase", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lac4/a;", "loaderUseCase", "Lbc4/e;", "createThumbnailUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lci3/f;", "filePickerBusinessErrorMapper", "Lci3/c;", "duplicatePhotoDialogMapper", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "Ld14/d;", "saveImageToStorageUseCase", "Lbc4/p;", "transformPickedImageUC", "Lae3/b;", "copyExifDataForCollisionPhotoUC", "Law0/s;", "getFileImageConfigurationUC", "Ld14/b;", "removeFileFromStorageUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lb00/c;", "imageConverter", "Lbi3/a;", "contract", "<init>", "(Lyy/a;Lci3/i;Lbc4/n;Lbc4/k;Lac4/a;Lbc4/e;Lib4/c;Lci3/f;Lci3/c;Lez/e;Lez/a;Lmx/c;Ld14/d;Lbc4/p;Lae3/b;Law0/s;Ld14/b;La14/m;Lyw/b;Lb00/c;Lbi3/a;)V", "Lcb4/d;", "N9", "()Lcb4/d;", "Lai3/a$m;", "action", "Lk10/c0;", "Lai3/b$b;", "state", "Lk10/l;", "ga", "(Lai3/a$m;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lsv0/q;", "fileImageConfiguration", "Loq/i0;", "fa", "(Lsv0/q;Ltq/e;)Ljava/lang/Object;", "M9", "", "uri", "", "T9", "(Ljava/lang/String;)Z", "", "Lwx/i$a;", "vehiclePhotos", "Ldx/i;", "Ldx/b;", "Z9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "Y9", "()Ldx/b$c;", "handleAsFilePickerError", "R9", "(Ldx/b;ZLtq/e;)Ljava/lang/Object;", "Lai3/c$a;", "U9", "(Lai3/b;)Lai3/c$a;", "b", "Lci3/i;", "c", "Lbc4/n;", "d", "Lbc4/k;", "e", "Lac4/a;", "f", "Lbc4/e;", "g", "Lib4/c;", "h", "Lci3/f;", "j", "Lci3/c;", "k", "Lez/e;", "l", "Lez/a;", "m", "Lmx/c;", "n", "Ld14/d;", "p", "Lbc4/p;", "q", "Lae3/b;", "r", "Law0/s;", "s", "Ld14/b;", "t", "La14/m;", "v", "Lyw/b;", "w", "Lb00/c;", "x", "Lbi3/a;", "Lai3/b$a;", "y", "Lai3/b$a;", "initialState", "Lk10/t;", "z", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lai3/a$g;", "A", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "B", "Lmu/p0;", "getState", "()Lmu/p0;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<ai3.b, ai3.a> implements ai3.c, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final xw.b<ai3.a.g> navAction;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final p0<ai3.c.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ci3.i mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.n pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bc4.e createThumbnailUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ci3.f filePickerBusinessErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ci3.c duplicatePhotoDialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final d14.d saveImageToStorageUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final bc4.p transformPickedImageUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ae3.b copyExifDataForCollisionPhotoUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final aw0.s getFileImageConfigurationUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final d14.b removeFileFromStorageUseCase;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final bi3.a contract;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final ai3.b.a initialState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ai3.b, ai3.a> stateMachine;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {
        int A;
        int B;
        int C;
        int D;
        final /* synthetic */ FileImageConfiguration F;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6522e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6523f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f6524g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f6525h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f6526j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f6527k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f6528l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f6529m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6530n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f6531p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f6532q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6533r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6534s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6535t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f6536v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f6537w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f6538x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f6539y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f6540z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FileImageConfiguration fileImageConfiguration, tq.e<? super a> eVar) {
            super(1, eVar);
            this.F = fileImageConfiguration;
        }

        /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:53:0x0230 A[Catch: Exception -> 0x02b0, c -> 0x02b5, CancellationException -> 0x02ba, TryCatch #17 {c -> 0x02b5, CancellationException -> 0x02ba, Exception -> 0x02b0, blocks: (B:51:0x022a, B:53:0x0230, B:55:0x0248, B:69:0x02bf), top: B:141:0x022a }] */
        /* JADX WARN: Code duplicated, block: B:55:0x0248 A[Catch: Exception -> 0x02b0, c -> 0x02b5, CancellationException -> 0x02ba, TryCatch #17 {c -> 0x02b5, CancellationException -> 0x02ba, Exception -> 0x02b0, blocks: (B:51:0x022a, B:53:0x0230, B:55:0x0248, B:69:0x02bf), top: B:141:0x022a }] */
        /* JADX WARN: Code duplicated, block: B:57:0x02aa  */
        /* JADX WARN: Code duplicated, block: B:58:0x02ac  */
        /* JADX WARN: Code duplicated, block: B:69:0x02bf A[Catch: Exception -> 0x02b0, c -> 0x02b5, CancellationException -> 0x02ba, TRY_LEAVE, TryCatch #17 {c -> 0x02b5, CancellationException -> 0x02ba, Exception -> 0x02b0, blocks: (B:51:0x022a, B:53:0x0230, B:55:0x0248, B:69:0x02bf), top: B:141:0x022a }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0343  */
        /* JADX WARN: Code duplicated, block: B:75:0x0346  */
        /* JADX WARN: Code duplicated, block: B:80:0x03d4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x03d4 -> B:147:0x03e8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r28) {
            /*
                Method dump skipped, instruction units count: 1304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai3.z.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return z.this.new a(this.F, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f6541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f6544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f6545h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f6546j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f6547k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f6549m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f6547k = obj;
            this.f6549m |= PKIFailureInfo.systemUnavail;
            return z.this.R9(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f6550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6552f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f6553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f6554h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f6555j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f6556k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f6557l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f6558m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6559n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f6560p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6561q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f6562r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f6563s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f6564t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f6565v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f6566w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f6568y;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f6566w = obj;
            this.f6568y |= PKIFailureInfo.systemUnavail;
            return z.this.Z9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<ai3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f6569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f6570b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f6571a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f6572b;

            /* JADX INFO: renamed from: ai3.z$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0141a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f6573d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f6574e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f6575f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f6577h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f6578j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f6579k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f6580l;

                public C0141a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f6573d = obj;
                    this.f6574e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, z zVar) {
                this.f6571a = hVar;
                this.f6572b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0141a c0141a;
                if (eVar instanceof C0141a) {
                    c0141a = (C0141a) eVar;
                    int i15 = c0141a.f6574e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0141a.f6574e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0141a = new C0141a(eVar);
                    }
                } else {
                    c0141a = new C0141a(eVar);
                }
                Object obj2 = c0141a.f6573d;
                Object objE = uq.b.e();
                int i16 = c0141a.f6574e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f6571a;
                    ai3.c.a aVarU9 = this.f6572b.U9((ai3.b) obj);
                    c0141a.f6575f = vq.j.a(obj);
                    c0141a.f6577h = vq.j.a(c0141a);
                    c0141a.f6578j = vq.j.a(obj);
                    c0141a.f6579k = vq.j.a(hVar);
                    c0141a.f6580l = 0;
                    c0141a.f6574e = 1;
                    if (hVar.F(aVarU9, c0141a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public d(mu.g gVar, z zVar) {
            this.f6569a = gVar;
            this.f6570b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ai3.c.a> hVar, tq.e eVar) {
            Object objA = this.f6569a.a(new a(hVar, this.f6570b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lai3/a$g;", "action", "Lai3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lai3/a$g;Lai3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ai3.a.g, ai3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6582f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ai3.a.g gVar = (ai3.a.g) this.f6582f;
            Object objE = uq.b.e();
            int i15 = this.f6581e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                this.f6582f = vq.j.a(gVar);
                this.f6581e = 1;
                if (zVar.F(gVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.g gVar, ai3.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = z.this.new e(eVar);
            eVar2.f6582f = gVar;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lai3/a$b;", "<unused var>", "Lai3/b;", "Loq/i0;", "<anonymous>", "(Lai3/a$b;Lai3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ai3.a.b, ai3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6584e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f6584e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ai3.a.g> bVarY1 = z.this.Y1();
                ai3.a.g.C0138a c0138a = ai3.a.g.C0138a.f6434a;
                this.f6584e = 1;
                if (bVarY1.F(c0138a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.b bVar, ai3.b bVar2, tq.e<? super i0> eVar) {
            return z.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lai3/a$d;", "<unused var>", "Lai3/b;", "Loq/i0;", "<anonymous>", "(Lai3/a$d;Lai3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ai3.a.d, ai3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6586e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f6586e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.d dVar, ai3.b bVar, tq.e<? super i0> eVar) {
            return z.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lai3/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lai3/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<ai3.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6588e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f6588e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(ai3.a.k.f6443a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ai3.b.a aVar, tq.e<? super i0> eVar) {
            return ((h) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lai3/a$k;", "<unused var>", "Lk10/c0;", "Lai3/b$a;", "state", "Lk10/l;", "Lai3/b;", "<anonymous>", "(Lai3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ai3.a.k, k10.c0<ai3.b.a>, tq.e<? super k10.l<? extends ai3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f6592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f6593h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f6594j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f6595k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f6596l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f6597m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6598n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f6599p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6600q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f6601r;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ai3.b.Initialized O(FileImageConfiguration fileImageConfiguration, ai3.b.a aVar) {
            return new ai3.b.Initialized(null, fileImageConfiguration, null, 5, null);
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0146  */
        /* JADX WARN: Code duplicated, block: B:54:0x0157  */
        /* JADX WARN: Code duplicated, block: B:55:0x0165  */
        /* JADX WARN: Code duplicated, block: B:57:0x0169  */
        /* JADX WARN: Code duplicated, block: B:61:0x017b  */
        /* JADX WARN: Code duplicated, block: B:65:0x01ac  */
        /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:69:0x01b7  */
        /* JADX WARN: Code duplicated, block: B:71:0x01bd  */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01a4, code lost:
        
            if (r0.R9(r5, false, r17) == r3) goto L63;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v10 */
        /* JADX WARN: Type inference failed for: r5v7 */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ai3.z.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.k kVar, k10.c0<ai3.b.a> c0Var, tq.e<? super k10.l<? extends ai3.b>> eVar) {
            i iVar = z.this.new i(eVar);
            iVar.f6601r = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lai3/a$c;", "action", "Lai3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lai3/a$c;Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ai3.a.DeletePhoto, ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6604f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        
            if (r6.c(r2, r5) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f6604f
                ai3.a$c r0 = (ai3.a.DeletePhoto) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f6603e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L60
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L3a
            L22:
                oq.u.b(r6)
                ai3.z r6 = ai3.z.this
                bi3.a r6 = ai3.z.u9(r6)
                o04.c r2 = r0.getImage()
                r5.f6604f = r0
                r5.f6603e = r4
                java.lang.Object r6 = r6.a3(r2, r5)
                if (r6 != r1) goto L3a
                goto L5f
            L3a:
                ai3.z r6 = ai3.z.this
                d14.b r6 = ai3.z.E9(r6)
                d14.b$a r2 = new d14.b$a
                o04.c r4 = r0.getImage()
                wx.g r4 = r4.getOriginalMetadata()
                java.lang.String r4 = r4.getName()
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r5.f6604f = r0
                r5.f6603e = r3
                java.lang.Object r6 = r6.c(r2, r5)
                if (r6 != r1) goto L60
            L5f:
                return r1
            L60:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ai3.z.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.DeletePhoto deletePhoto, ai3.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = z.this.new j(eVar);
            jVar.f6604f = deletePhoto;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lai3/a$e;", "<unused var>", "Lai3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lai3/a$e;Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ai3.a.e, ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6607f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ai3.b.Initialized initialized = (ai3.b.Initialized) this.f6607f;
            Object objE = uq.b.e();
            int i15 = this.f6606e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (initialized.e().isEmpty()) {
                    z.this.d9(new ai3.a.g.ShowDialog(z.this.N9()));
                } else {
                    xw.b<ai3.a.g> bVarY1 = z.this.Y1();
                    ai3.a.g.d dVar = ai3.a.g.d.f6437a;
                    this.f6607f = vq.j.a(initialized);
                    this.f6606e = 1;
                    if (bVarY1.F(dVar, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.e eVar, ai3.b.Initialized initialized, tq.e<? super i0> eVar2) {
            k kVar = z.this.new k(eVar2);
            kVar.f6607f = initialized;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Ltv0/b$a;", "photos", "Lai3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljava/util/List;Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<List<? extends YourDetails.Photo>, ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6610f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List list = (List) this.f6610f;
            uq.b.e();
            if (this.f6609e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new ai3.a.UpdateThumbnails(list));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(List<YourDetails.Photo> list, ai3.b.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = z.this.new l(eVar);
            lVar.f6610f = list;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lai3/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6612e;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f6612e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(new ai3.a.UpdateThumbnails(z.this.contract.C1()));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ai3.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((m) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new m(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lai3/a$h;", "<unused var>", "Lk10/c0;", "Lai3/b$b;", "state", "Lk10/l;", "Lai3/b;", "<anonymous>", "(Lai3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ai3.a.h, k10.c0<ai3.b.Initialized>, tq.e<? super k10.l<? extends ai3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6615f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ai3.b.Initialized O(ai3.b.Initialized initialized) {
            return ai3.b.Initialized.b(initialized, null, null, g30.v.EXPANDED, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f6615f;
            uq.b.e();
            if (this.f6614e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ai3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.n.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.h hVar, k10.c0<ai3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ai3.b>> eVar) {
            n nVar = new n(eVar);
            nVar.f6615f = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lai3/a$f;", "<unused var>", "Lk10/c0;", "Lai3/b$b;", "state", "Lk10/l;", "Lai3/b;", "<anonymous>", "(Lai3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ai3.a.f, k10.c0<ai3.b.Initialized>, tq.e<? super k10.l<? extends ai3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6616e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6617f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ai3.b.Initialized O(ai3.b.Initialized initialized) {
            return ai3.b.Initialized.b(initialized, null, null, g30.v.HIDDEN, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f6617f;
            uq.b.e();
            if (this.f6616e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ai3.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.o.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.f fVar, k10.c0<ai3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ai3.b>> eVar) {
            o oVar = new o(eVar);
            oVar.f6617f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lai3/a$a;", "<unused var>", "Lai3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lai3/a$a;Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ai3.a.C0137a, ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6619f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ai3.b.Initialized initialized = (ai3.b.Initialized) this.f6619f;
            Object objE = uq.b.e();
            int i15 = this.f6618e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                FileImageConfiguration fileImageConfiguration = initialized.getFileImageConfiguration();
                this.f6619f = vq.j.a(initialized);
                this.f6618e = 1;
                if (zVar.M9(fileImageConfiguration, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.C0137a c0137a, ai3.b.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = z.this.new p(eVar);
            pVar.f6619f = initialized;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lai3/a$l;", "<unused var>", "Lai3/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lai3/a$l;Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<ai3.a.l, ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6622f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ai3.b.Initialized initialized = (ai3.b.Initialized) this.f6622f;
            Object objE = uq.b.e();
            int i15 = this.f6621e;
            if (i15 == 0) {
                oq.u.b(obj);
                z zVar = z.this;
                FileImageConfiguration fileImageConfiguration = initialized.getFileImageConfiguration();
                this.f6622f = vq.j.a(initialized);
                this.f6621e = 1;
                if (zVar.fa(fileImageConfiguration, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.l lVar, ai3.b.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = z.this.new q(eVar);
            qVar.f6622f = initialized;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lai3/a$i;", "action", "Lk10/c0;", "Lai3/b$b;", "state", "Lk10/l;", "Lai3/b;", "<anonymous>", "(Lai3/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<ai3.a.OnBottomSheetStateChanged, k10.c0<ai3.b.Initialized>, tq.e<? super k10.l<? extends ai3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6625f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f6626g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ai3.b.Initialized O(ai3.a.OnBottomSheetStateChanged onBottomSheetStateChanged, ai3.b.Initialized initialized) {
            return ai3.b.Initialized.b(initialized, null, null, onBottomSheetStateChanged.getState(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ai3.a.OnBottomSheetStateChanged onBottomSheetStateChanged = (ai3.a.OnBottomSheetStateChanged) this.f6625f;
            k10.c0 c0Var = (k10.c0) this.f6626g;
            uq.b.e();
            if (this.f6624e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ai3.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.r.O(onBottomSheetStateChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.OnBottomSheetStateChanged onBottomSheetStateChanged, k10.c0<ai3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ai3.b>> eVar) {
            r rVar = new r(eVar);
            rVar.f6625f = onBottomSheetStateChanged;
            rVar.f6626g = c0Var;
            return rVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lai3/a$m;", "action", "Lk10/c0;", "Lai3/b$b;", "state", "Lk10/l;", "Lai3/b;", "<anonymous>", "(Lai3/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<ai3.a.UpdateThumbnails, k10.c0<ai3.b.Initialized>, tq.e<? super k10.l<? extends ai3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6627e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6628f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f6629g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ai3.a.UpdateThumbnails updateThumbnails = (ai3.a.UpdateThumbnails) this.f6628f;
            k10.c0 c0Var = (k10.c0) this.f6629g;
            Object objE = uq.b.e();
            int i15 = this.f6627e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            z zVar = z.this;
            this.f6628f = vq.j.a(updateThumbnails);
            this.f6629g = vq.j.a(c0Var);
            this.f6627e = 1;
            Object objGa = zVar.ga(updateThumbnails, c0Var, this);
            return objGa == objE ? objE : objGa;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.UpdateThumbnails updateThumbnails, k10.c0<ai3.b.Initialized> c0Var, tq.e<? super k10.l<? extends ai3.b>> eVar) {
            s sVar = z.this.new s(eVar);
            sVar.f6628f = updateThumbnails;
            sVar.f6629g = c0Var;
            return sVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lai3/a$j;", "action", "Lai3/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lai3/a$j;Lai3/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<ai3.a.OnImageClicked, ai3.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6631e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f6632f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f6633g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f6634h;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
        
            if (r4.F(r5, r8) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f6634h
                ai3.a$j r0 = (ai3.a.OnImageClicked) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f6633g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r0 = r8.f6631e
                tv0.b$a r0 = (tv0.YourDetails.Photo) r0
                oq.u.b(r9)
                goto L7c
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                oq.u.b(r9)
                goto L42
            L26:
                oq.u.b(r9)
                ai3.z r9 = ai3.z.this
                bi3.a r9 = ai3.z.u9(r9)
                o04.c r2 = r0.getImage()
                java.lang.Object r5 = vq.j.a(r0)
                r8.f6634h = r5
                r8.f6633g = r4
                java.lang.Object r9 = r9.y6(r2, r8)
                if (r9 != r1) goto L42
                goto L7b
            L42:
                tv0.b$a r9 = (tv0.YourDetails.Photo) r9
                if (r9 == 0) goto L7c
                ai3.z r2 = ai3.z.this
                xw.b r4 = r2.Y1()
                ai3.a$g$f r5 = new ai3.a$g$f
                dx3.a$b r6 = new dx3.a$b
                mx.c r2 = ai3.z.B9(r2)
                int r7 = md3.b.Q
                mx.a r2 = r2.c(r7)
                wx.k$a r7 = r9.getImage()
                r6.<init>(r2, r7)
                r5.<init>(r6)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f6634h = r0
                java.lang.Object r9 = vq.j.a(r9)
                r8.f6631e = r9
                r9 = 0
                r8.f6632f = r9
                r8.f6633g = r3
                java.lang.Object r9 = r4.F(r5, r8)
                if (r9 != r1) goto L7c
            L7b:
                return r1
            L7c:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ai3.z.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ai3.a.OnImageClicked onImageClicked, ai3.b.Initialized initialized, tq.e<? super i0> eVar) {
            t tVar = z.this.new t(eVar);
            tVar.f6634h = onImageClicked;
            return tVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends dx.i<? extends dx.b, ? extends i0>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f6638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f6639h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f6640j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f6641k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f6642l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f6643m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6644n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f6645p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6646q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ FileImageConfiguration f6648s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(FileImageConfiguration fileImageConfiguration, tq.e<? super u> eVar) {
            super(1, eVar);
            this.f6648s = fileImageConfiguration;
        }

        /* JADX WARN: Code duplicated, block: B:52:0x017a  */
        /* JADX WARN: Code duplicated, block: B:55:0x018b  */
        /* JADX WARN: Code duplicated, block: B:56:0x0199  */
        /* JADX WARN: Code duplicated, block: B:58:0x019d  */
        /* JADX WARN: Code duplicated, block: B:62:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String message;
            dx.i iVarA;
            Object objB;
            Object left;
            z zVar;
            dx.b bVar;
            Object objC;
            int i15;
            int i16;
            int i17;
            dx.j<dx.b> jVar;
            ex.b bVar2;
            ex.b bVar3;
            ex.b bVar4;
            z zVar2;
            int i18;
            int i19;
            Object objZ9;
            Object left2;
            Object objE = uq.b.e();
            int i25 = this.f6646q;
            ?? r15 = 2;
            try {
                try {
                    if (i25 == 0) {
                        oq.u.b(obj);
                        z.this.d9(ai3.a.f.f6433a);
                        z zVar3 = z.this;
                        FileImageConfiguration fileImageConfiguration = this.f6648s;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            bc4.k kVar = zVar3.pickPhotoFromCameraWithSizeValidationUseCase;
                            bc4.k.Params params = new bc4.k.Params(zVar3.dateFormatter.d(new fz.b.LocalDateTime(zVar3.currentTimeProvider.i()), fz.c.NO_SPACES), vq.b.e(fileImageConfiguration.getImageMaxSide()), vq.b.e(fileImageConfiguration.getQuality()), null, false, pq.v.q(xx.b.DateTime, xx.b.GPS), 16, null);
                            this.f6636e = zVar3;
                            this.f6637f = jVarA;
                            this.f6638g = vq.j.a(aVar);
                            this.f6639h = vq.j.a(aVar);
                            this.f6640j = aVar;
                            this.f6641k = 0;
                            this.f6642l = 0;
                            this.f6643m = 0;
                            this.f6644n = 0;
                            this.f6645p = 0;
                            this.f6646q = 1;
                            objC = kVar.c(params, this);
                            if (objC != objE) {
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                jVar = jVarA;
                                bVar2 = aVar;
                                bVar3 = bVar2;
                                bVar4 = bVar3;
                                zVar2 = zVar3;
                                i18 = 0;
                                i19 = 0;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            left2 = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                            zVar = z.this;
                            if (left instanceof dx.i.Left) {
                                return left;
                            }
                            bVar = (dx.b) ((dx.i.Left) left).b();
                            this.f6636e = left;
                            this.f6637f = vq.j.a(bVar);
                            this.f6638g = null;
                            this.f6639h = null;
                            this.f6640j = null;
                            this.f6641k = 0;
                            this.f6642l = 0;
                            this.f6646q = 3;
                            if (zVar.R9(bVar, true, this) != objE) {
                                return left;
                            }
                        }
                        return objE;
                    }
                    if (i25 != 1) {
                        if (i25 != 2) {
                            if (i25 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dx.i iVar = (dx.i) this.f6636e;
                            oq.u.b(obj);
                            return iVar;
                        }
                        try {
                            oq.u.b(obj);
                            objZ9 = obj;
                            left2 = new dx.i.Right((dx.i) objZ9);
                        } catch (ex.c e18) {
                            e = e18;
                            left2 = new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                        left = left2;
                        zVar = z.this;
                        if (left instanceof dx.i.Left) {
                            return left;
                        }
                        bVar = (dx.b) ((dx.i.Left) left).b();
                        this.f6636e = left;
                        this.f6637f = vq.j.a(bVar);
                        this.f6638g = null;
                        this.f6639h = null;
                        this.f6640j = null;
                        this.f6641k = 0;
                        this.f6642l = 0;
                        this.f6646q = 3;
                        if (zVar.R9(bVar, true, this) != objE) {
                            return objE;
                        }
                        return left;
                    }
                    int i26 = this.f6645p;
                    int i27 = this.f6644n;
                    int i28 = this.f6643m;
                    int i29 = this.f6642l;
                    int i35 = this.f6641k;
                    ex.b bVar5 = (ex.b) this.f6640j;
                    ex.b bVar6 = (ex.b) this.f6639h;
                    ex.b bVar7 = (ex.b) this.f6638g;
                    jVar = (dx.j) this.f6637f;
                    z zVar4 = (z) this.f6636e;
                    try {
                        oq.u.b(obj);
                        bVar4 = bVar7;
                        bVar3 = bVar6;
                        bVar2 = bVar5;
                        i19 = i35;
                        i17 = i29;
                        i16 = i28;
                        i15 = i27;
                        zVar2 = zVar4;
                        i18 = i26;
                        objC = obj;
                    } catch (ex.c e25) {
                        e = e25;
                        left2 = new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e26) {
                        throw e26;
                    } catch (Exception e27) {
                        e = e27;
                        r15 = jVar;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        left = new dx.i.Left(objB);
                        zVar = z.this;
                        if (left instanceof dx.i.Left) {
                            return left;
                        }
                        bVar = (dx.b) ((dx.i.Left) left).b();
                        this.f6636e = left;
                        this.f6637f = vq.j.a(bVar);
                        this.f6638g = null;
                        this.f6639h = null;
                        this.f6640j = null;
                        this.f6641k = 0;
                        this.f6642l = 0;
                        this.f6646q = 3;
                        if (zVar.R9(bVar, true, this) != objE) {
                            return left;
                        }
                    }
                    List listE = pq.v.e(((bc4.k.Result) bVar2.a((dx.i) objC)).getImageFile());
                    this.f6636e = jVar;
                    this.f6637f = vq.j.a(bVar4);
                    this.f6638g = vq.j.a(bVar3);
                    this.f6639h = vq.j.a(listE);
                    this.f6640j = null;
                    this.f6641k = i19;
                    this.f6642l = i17;
                    this.f6643m = i16;
                    this.f6644n = i15;
                    this.f6645p = i18;
                    this.f6646q = 2;
                    objZ9 = zVar2.Z9(listE, this);
                    if (objZ9 != objE) {
                        left2 = new dx.i.Right((dx.i) objZ9);
                        left = left2;
                        zVar = z.this;
                        if (left instanceof dx.i.Left) {
                            return left;
                        }
                        bVar = (dx.b) ((dx.i.Left) left).b();
                        this.f6636e = left;
                        this.f6637f = vq.j.a(bVar);
                        this.f6638g = null;
                        this.f6639h = null;
                        this.f6640j = null;
                        this.f6641k = 0;
                        this.f6642l = 0;
                        this.f6646q = 3;
                        if (zVar.R9(bVar, true, this) != objE) {
                            return left;
                        }
                    }
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
            return objE;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return z.this.new u(this.f6648s, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends dx.i<? extends dx.b, i0>>> eVar) {
            return ((u) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class v extends vq.d {
        int A;
        int B;
        int C;
        /* synthetic */ Object D;
        int F;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f6649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f6650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f6651f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f6652g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f6653h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f6654j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f6655k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f6656l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f6657m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f6658n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f6659p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f6660q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f6661r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f6662s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f6663t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f6664v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f6665w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f6666x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f6667y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f6668z;

        v(tq.e<? super v> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.D = obj;
            this.F |= PKIFailureInfo.systemUnavail;
            return z.this.ga(null, null, this);
        }
    }

    public z(yy.a aVar, ci3.i iVar, bc4.n nVar, bc4.k kVar, ac4.a aVar2, bc4.e eVar, ib4.c cVar, ci3.f fVar, ci3.c cVar2, ez.e eVar2, ez.a aVar3, mx.c cVar3, d14.d dVar, bc4.p pVar, ae3.b bVar, aw0.s sVar, d14.b bVar2, a14.m mVar, yw.b bVar3, b00.c cVar4, bi3.a aVar4) {
        this.mapper = iVar;
        this.pickPhotoFromGalleryUseCase = nVar;
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.loaderUseCase = aVar2;
        this.createThumbnailUseCase = eVar;
        this.genericDomainErrorMapper = cVar;
        this.filePickerBusinessErrorMapper = fVar;
        this.duplicatePhotoDialogMapper = cVar2;
        this.dateFormatter = eVar2;
        this.currentTimeProvider = aVar3;
        this.labelProvider = cVar3;
        this.saveImageToStorageUseCase = dVar;
        this.transformPickedImageUC = pVar;
        this.copyExifDataForCollisionPhotoUC = bVar;
        this.getFileImageConfigurationUC = sVar;
        this.removeFileFromStorageUseCase = bVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar3;
        this.imageConverter = cVar4;
        this.contract = aVar4;
        ai3.b.a aVar5 = ai3.b.a.f6447a;
        this.initialState = aVar5;
        this.stateMachine = aVar.a(aVar5, new er.l() { // from class: ai3.p
            @Override // er.l
            public final Object b(Object obj) {
                return z.ba(this.f6492a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new d(e9().getState(), this), U9(aVar5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M9(FileImageConfiguration fileImageConfiguration, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(this.loaderUseCase, null, new a(fileImageConfiguration, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData N9() {
        return new DialogData(cb4.h.b.f24985a, this.labelProvider.c(md3.b.f125709e1), this.labelProvider.c(md3.b.f125701d1), new DialogButtonTextData(this.labelProvider.c(md3.b.K), null, b9(ai3.a.g.d.f6437a), 2, null), new DialogButtonTextData(this.labelProvider.c(md3.b.T), null, new er.a() { // from class: ai3.w
            @Override // er.a
            public final Object a() {
                return z.O9();
            }
        }, 2, null), null, new er.a() { // from class: ai3.x
            @Override // er.a
            public final Object a() {
                return z.P9();
            }
        }, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r3.F(r5, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        if (r14.F(r2, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R9(dx.b r12, boolean r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai3.z.R9(dx.b, boolean, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S9(z zVar, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            zVar.d9(ai3.a.k.f6443a);
        } else {
            zVar.d9(ai3.a.b.f6429a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T9(String uri) {
        List<YourDetails.Photo> listC1 = this.contract.C1();
        if ((listC1 instanceof Collection) && listC1.isEmpty()) {
            return false;
        }
        Iterator<T> it = listC1.iterator();
        while (it.hasNext()) {
            if (fr.t.c(((YourDetails.Photo) it.next()).getOriginalUri(), uri)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ai3.c.a U9(ai3.b bVar) {
        return this.mapper.b(new ci3.i.Params(bVar, b9(ai3.a.h.f6440a), b9(ai3.a.C0137a.f6428a), b9(ai3.a.l.f6444a), new er.l() { // from class: ai3.o
            @Override // er.l
            public final Object b(Object obj) {
                return z.V9(this.f6491a, (o04.c) obj);
            }
        }, new er.l() { // from class: ai3.q
            @Override // er.l
            public final Object b(Object obj) {
                return z.W9(this.f6493a, (o04.c) obj);
            }
        }, new er.l() { // from class: ai3.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.X9(this.f6494a, (g30.v) obj);
            }
        }, b9(ai3.a.e.f6432a), b9(ai3.a.g.C0138a.f6434a), b9(ai3.a.g.c.f6436a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(z zVar, o04.c cVar) {
        zVar.d9(new ai3.a.DeletePhoto(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(z zVar, o04.c cVar) {
        zVar.d9(new ai3.a.OnImageClicked(cVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(z zVar, g30.v vVar) {
        zVar.d9(new ai3.a.OnBottomSheetStateChanged(vVar));
        return i0.f148189a;
    }

    private final dx.b.Business Y9() {
        return new dx.b.Business(null, null, this.labelProvider.c(md3.b.f125859x), null, null, this.labelProvider.c(md3.b.f125731h), null, 91, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x0132 A[Catch: Exception -> 0x027d, c -> 0x0281, CancellationException -> 0x0285, TRY_LEAVE, TryCatch #13 {c -> 0x0281, CancellationException -> 0x0285, Exception -> 0x027d, blocks: (B:37:0x012c, B:39:0x0132), top: B:155:0x012c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0186  */
    /* JADX WARN: Code duplicated, block: B:44:0x0189  */
    /* JADX WARN: Code duplicated, block: B:51:0x0206  */
    /* JADX WARN: Code duplicated, block: B:52:0x020a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x020a -> B:143:0x021b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Z9(java.util.List<wx.i.Image> r22, tq.e<? super dx.i<? extends dx.b, oq.i0>> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai3.z.Z9(java.util.List, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ba(final z zVar, k10.v vVar) {
        vVar.c(q0.c(ai3.b.class), new er.l() { // from class: ai3.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.ca(this.f6495a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ai3.b.a.class), new er.l() { // from class: ai3.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.da(this.f6496a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ai3.b.Initialized.class), new er.l() { // from class: ai3.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.ea(this.f6497a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ca(z zVar, k10.z zVar2) {
        e eVar = zVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(ai3.a.g.class), oVar, eVar);
        zVar2.x(q0.c(ai3.a.b.class), oVar, zVar.new f(null));
        zVar2.x(q0.c(ai3.a.d.class), oVar, zVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 da(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new h(null));
        i iVar = zVar.new i(null);
        zVar2.v(q0.c(ai3.a.k.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ea(z zVar, k10.z zVar2) {
        k10.k.s(zVar2, zVar.contract.G3(), null, zVar.new l(null), 2, null);
        zVar2.C(zVar.new m(null));
        n nVar = new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.v(q0.c(ai3.a.h.class), oVar, nVar);
        zVar2.v(q0.c(ai3.a.f.class), oVar, new o(null));
        zVar2.x(q0.c(ai3.a.C0137a.class), oVar, zVar.new p(null));
        zVar2.x(q0.c(ai3.a.l.class), oVar, zVar.new q(null));
        zVar2.v(q0.c(ai3.a.OnBottomSheetStateChanged.class), oVar, new r(null));
        zVar2.v(q0.c(ai3.a.UpdateThumbnails.class), oVar, zVar.new s(null));
        zVar2.x(q0.c(ai3.a.OnImageClicked.class), oVar, zVar.new t(null));
        zVar2.x(q0.c(ai3.a.DeletePhoto.class), oVar, zVar.new j(null));
        zVar2.x(q0.c(ai3.a.e.class), oVar, zVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fa(FileImageConfiguration fileImageConfiguration, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(this.loaderUseCase, null, new u(fileImageConfiguration, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:135:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x019e A[Catch: Exception -> 0x01c6, c -> 0x01c9, CancellationException -> 0x01ce, TryCatch #11 {c -> 0x01c9, CancellationException -> 0x01ce, Exception -> 0x01c6, blocks: (B:87:0x0376, B:35:0x0178, B:37:0x017e, B:38:0x0198, B:40:0x019e, B:51:0x01d9, B:53:0x01df, B:57:0x0258, B:60:0x0283, B:62:0x0287, B:84:0x0358, B:85:0x035d, B:88:0x038e), top: B:129:0x0376 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x01c1 A[LOOP:0: B:38:0x0198->B:43:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ai3.z$v] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5, types: [k10.c0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [ai3.z$v, tq.e] */
    /* JADX WARN: Type inference failed for: r6v6, types: [ai3.z$v, tq.e] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [b00.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0272 -> B:130:0x0324). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x02fd -> B:125:0x030f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x035e -> B:71:0x033c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object ga(ai3.a.UpdateThumbnails r27, k10.c0<ai3.b.Initialized> r28, tq.e<? super k10.l<ai3.b.Initialized>> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai3.z.ga(ai3.a$m, k10.c0, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ai3.b.Initialized ha(List list, ai3.b.Initialized initialized) {
        return ai3.b.Initialized.b(initialized, list, null, null, 6, null);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ai3.a.g gVar, tq.e<? super i0> eVar) {
        return super.F(gVar, eVar);
    }

    @Override // zx.b
    public xw.b<ai3.a.g> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: aa, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(bi3.a aVar) {
        super.P5(aVar);
    }

    @Override // l00.g
    protected k10.t<ai3.b, ai3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ai3.c.a> getState() {
        return this.state;
    }
}
