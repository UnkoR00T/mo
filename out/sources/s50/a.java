package s50;

import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0012\u0019\u0016Ba\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0018R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u001e\u0010\u0018\u0082\u0001\u0003$%&¨\u0006'"}, d2 = {"Ls50/a;", "", "", "testTag", "", "checked", "enabled", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "Lmx/a;", "contentDescription", "additionalStateDescription", "", "testIndexTag", "invisibleToUser", "<init>", "(Ljava/lang/String;ZZLer/l;Lmx/a;Ljava/lang/String;Ljava/lang/Integer;Z)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Z", "()Z", "c", "d", "Ler/l;", "f", "()Ler/l;", "e", "Lmx/a;", "()Lmx/a;", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ls50/a$a;", "Ls50/a$b;", "Ls50/a$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f177982i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean checked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<Boolean, i0> onCheckedChange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Label contentDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String additionalStateDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Integer testIndexTag;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean invisibleToUser;

    /* JADX INFO: renamed from: s50.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ls50/a$a;", "Ls50/a;", "", "testTag", "", "checked", "enabled", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "Lmx/a;", "contentDescription", "additionalStateDescription", "", "testIndexTag", "invisibleToUser", "<init>", "(Ljava/lang/String;ZZLer/l;Lmx/a;Ljava/lang/String;Ljava/lang/Integer;Z)V", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C4550a extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f177991j = 0;

        public C4550a(String str, boolean z15, boolean z16, er.l<? super Boolean, i0> lVar, Label label, String str2, Integer num, boolean z17) {
            super(str, z15, z16, lVar, label, str2, num, z17, null);
        }

        public /* synthetic */ C4550a(String str, boolean z15, boolean z16, er.l lVar, Label label, String str2, Integer num, boolean z17, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : str, z15, (i15 & 4) != 0 ? true : z16, lVar, (i15 & 16) != 0 ? null : label, (i15 & 32) != 0 ? null : str2, (i15 & 64) != 0 ? null : num, (i15 & 128) != 0 ? false : z17);
        }
    }

    public /* synthetic */ a(String str, boolean z15, boolean z16, er.l lVar, Label label, String str2, Integer num, boolean z17, fr.k kVar) {
        this(str, z15, z16, lVar, label, str2, num, z17);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalStateDescription() {
        return this.additionalStateDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getChecked() {
        return this.checked;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getInvisibleToUser() {
        return this.invisibleToUser;
    }

    public final er.l<Boolean, i0> f() {
        return this.onCheckedChange;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getTestIndexTag() {
        return this.testIndexTag;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a(String str, boolean z15, boolean z16, er.l<? super Boolean, i0> lVar, Label label, String str2, Integer num, boolean z17) {
        this.testTag = str;
        this.checked = z15;
        this.enabled = z16;
        this.onCheckedChange = lVar;
        this.contentDescription = label;
        this.additionalStateDescription = str2;
        this.testIndexTag = num;
        this.invisibleToUser = z17;
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ls50/a$c;", "Ls50/a;", "", "testTag", "", "checked", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lhz/b;", "validationState", "enabled", "additionalStateDescription", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "", "testIndexTag", "<init>", "(Ljava/lang/String;ZLmx/a;Lhz/b;ZLjava/lang/String;Ler/l;Ljava/lang/Integer;)V", "j", "Lmx/a;", "i", "()Lmx/a;", "k", "Lhz/b;", "()Lhz/b;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final Label label;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final hz.b validationState;

        public c(String str, boolean z15, Label label, hz.b bVar, boolean z16, String str2, er.l<? super Boolean, i0> lVar, Integer num) {
            super(str, z15, z16, lVar, null, str2, num, false, 128, null);
            this.label = label;
            this.validationState = bVar;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public /* synthetic */ c(String str, boolean z15, Label label, hz.b bVar, boolean z16, String str2, er.l lVar, Integer num, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : str, z15, label, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 16) != 0 ? true : z16, (i15 & 32) != 0 ? null : str2, lVar, (i15 & 128) != 0 ? null : num);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Ls50/a$b;", "Ls50/a;", "", "testTag", "", "checked", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lhz/b;", "validationState", "enabled", "additionalStateDescription", "Lkotlin/Function1;", "Loq/i0;", "onCheckedChange", "", "testIndexTag", "Ls50/b;", "type", "customActionContentDescription", "<init>", "(Ljava/lang/String;ZLmx/a;Lhz/b;ZLjava/lang/String;Ler/l;Ljava/lang/Integer;Ls50/b;Lmx/a;)V", "j", "Lmx/a;", "()Lmx/a;", "k", "Lhz/b;", "l", "()Lhz/b;", "Ls50/b;", "()Ls50/b;", "m", "i", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f177992n = hz.b.f86845b;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final Label label;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final hz.b validationState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final s50.b type;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final Label customActionContentDescription;

        public b(String str, boolean z15, Label label, hz.b bVar, boolean z16, String str2, er.l<? super Boolean, i0> lVar, Integer num, s50.b bVar2, Label label2) {
            super(str, z15, z16, lVar, null, str2, num, false, 128, null);
            this.label = label;
            this.validationState = bVar;
            this.type = bVar2;
            this.customActionContentDescription = label2;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Label getCustomActionContentDescription() {
            return this.customActionContentDescription;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Label getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final s50.b getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public /* synthetic */ b(String str, boolean z15, Label label, hz.b bVar, boolean z16, String str2, er.l lVar, Integer num, s50.b bVar2, Label label2, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : str, z15, label, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 16) != 0 ? true : z16, (i15 & 32) != 0 ? null : str2, lVar, (i15 & 128) != 0 ? null : num, bVar2, label2);
        }
    }

    public /* synthetic */ a(String str, boolean z15, boolean z16, er.l lVar, Label label, String str2, Integer num, boolean z17, int i15, fr.k kVar) {
        this(str, z15, z16, lVar, label, str2, num, (i15 & 128) != 0 ? false : z17, null);
    }
}
