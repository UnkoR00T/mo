package l63;

import fr.k;
import fr.t;
import j30.ButtonTextData;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import vw.NavigationDialogModel;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll63/b;", "Lxw/f;", "Ll63/b$a;", "Lvw/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Ll63/b$a;)Lvw/a;", "a", "Lmx/c;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements f<Params, NavigationDialogModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: l63.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C2822b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f116719a;

        static {
            int[] iArr = new int[m63.a.values().length];
            try {
                iArr[m63.a.DELETE_PHONE_NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m63.a.DELETE_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m63.a.SAVE_TEMPORARY_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f116719a = iArr;
        }
    }

    public b(c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public NavigationDialogModel b(Params params) {
        int i15 = C2822b.f116719a[params.getReasonDisplayDialog().ordinal()];
        if (i15 == 1) {
            return new NavigationDialogModel(this.labelProvider.c(c53.a.f23682d0), this.labelProvider.c(c53.a.Z), null, null, null, params.c(), new ButtonTextData(null, this.labelProvider.c(c53.a.f23681d), null, null, params.d(), 13, null), new ButtonTextData(null, this.labelProvider.c(c53.a.f23672a), null, null, params.c(), 13, null), 28, null);
        }
        if (i15 == 2) {
            return new NavigationDialogModel(this.labelProvider.c(c53.a.f23673a0), this.labelProvider.c(c53.a.Z), null, null, null, params.c(), new ButtonTextData(null, this.labelProvider.c(c53.a.f23681d), null, null, params.d(), 13, null), new ButtonTextData(null, this.labelProvider.c(c53.a.f23672a), null, null, params.c(), 13, null), 28, null);
        }
        if (i15 == 3) {
            return new NavigationDialogModel(this.labelProvider.c(c53.a.f23734u1), this.labelProvider.c(c53.a.f23731t1), null, null, null, null, new ButtonTextData(null, this.labelProvider.c(c53.a.f23728s1), null, null, params.d(), 13, null), new ButtonTextData(null, this.labelProvider.c(c53.a.f23708m), null, null, params.c(), 13, null), 60, null);
        }
        throw new p();
    }

    /* JADX INFO: renamed from: l63.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll63/b$a;", "", "Lm63/a;", "reasonDisplayDialog", "Lkotlin/Function0;", "Loq/i0;", "onPrimaryButtonClick", "onCancelAction", "<init>", "(Lm63/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm63/a;", "e", "()Lm63/a;", "b", "Ler/a;", "d", "()Ler/a;", "c", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m63.a reasonDisplayDialog;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onPrimaryButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCancelAction;

        public Params(m63.a aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.reasonDisplayDialog = aVar;
            this.onPrimaryButtonClick = aVar2;
            this.onCancelAction = aVar3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 b() {
            return i0.f148189a;
        }

        public final er.a<i0> c() {
            return this.onCancelAction;
        }

        public final er.a<i0> d() {
            return this.onPrimaryButtonClick;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final m63.a getReasonDisplayDialog() {
            return this.reasonDisplayDialog;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.reasonDisplayDialog == params.reasonDisplayDialog && t.c(this.onPrimaryButtonClick, params.onPrimaryButtonClick) && t.c(this.onCancelAction, params.onCancelAction);
        }

        public int hashCode() {
            return (((this.reasonDisplayDialog.hashCode() * 31) + this.onPrimaryButtonClick.hashCode()) * 31) + this.onCancelAction.hashCode();
        }

        public String toString() {
            return "Params(reasonDisplayDialog=" + this.reasonDisplayDialog + ", onPrimaryButtonClick=" + this.onPrimaryButtonClick + ", onCancelAction=" + this.onCancelAction + ')';
        }

        public /* synthetic */ Params(m63.a aVar, er.a aVar2, er.a aVar3, int i15, k kVar) {
            this(aVar, aVar2, (i15 & 4) != 0 ? new er.a() { // from class: l63.a
                @Override // er.a
                public final Object a() {
                    return b.Params.b();
                }
            } : aVar3);
        }
    }
}
