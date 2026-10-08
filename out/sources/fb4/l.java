package fb4;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import h30.ButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lfb4/l;", "Lxw/f;", "Lfb4/l$a;", "Li40/a;", "Lfb4/a;", "dialogIconMapper", "Lcx/a;", "eventThrottler", "<init>", "(Lfb4/a;Lcx/a;)V", "params", "u", "(Lfb4/l$a;)Li40/a;", "a", "Lfb4/a;", "b", "Lcx/a;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements xw.f<Params, i40.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a dialogIconMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cx.a eventThrottler;

    /* JADX INFO: renamed from: fb4.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfb4/l$a;", "", "Lcb4/d;", "dialogData", "<init>", "(Lcb4/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/d;", "()Lcb4/d;", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DialogData dialogData;

        public Params(DialogData dialogData) {
            this.dialogData = dialogData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final DialogData getDialogData() {
            return this.dialogData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.dialogData, ((Params) other).dialogData);
        }

        public int hashCode() {
            return this.dialogData.hashCode();
        }

        public String toString() {
            return "Params(dialogData=" + this.dialogData + ')';
        }
    }

    public l(a aVar, cx.a aVar2) {
        this.dialogIconMapper = aVar;
        this.eventThrottler = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(DialogButtonTextData dialogButtonTextData) {
        dialogButtonTextData.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(l lVar, final Params params) {
        lVar.eventThrottler.c(800L, new er.a() { // from class: fb4.f
            @Override // er.a
            public final Object a() {
                return l.G(params);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params) {
        params.getDialogData().getPrimaryButtonData().e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(l lVar, final DialogButtonTextData dialogButtonTextData) {
        lVar.eventThrottler.c(800L, new er.a() { // from class: fb4.b
            @Override // er.a
            public final Object a() {
                return l.I(dialogButtonTextData);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(DialogButtonTextData dialogButtonTextData) {
        dialogButtonTextData.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(l lVar, final DialogButtonTextData dialogButtonTextData) {
        lVar.eventThrottler.c(800L, new er.a() { // from class: fb4.d
            @Override // er.a
            public final Object a() {
                return l.K(dialogButtonTextData);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(DialogButtonTextData dialogButtonTextData) {
        dialogButtonTextData.e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(l lVar, final Params params) {
        lVar.eventThrottler.c(800L, new er.a() { // from class: fb4.e
            @Override // er.a
            public final Object a() {
                return l.x(params);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Params params) {
        params.getDialogData().getPrimaryButtonData().e().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(l lVar, final DialogButtonTextData dialogButtonTextData) {
        lVar.eventThrottler.c(800L, new er.a() { // from class: fb4.c
            @Override // er.a
            public final Object a() {
                return l.E(dialogButtonTextData);
            }
        });
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public i40.a b(final Params params) {
        cb4.h type = params.getDialogData().getType();
        if (type instanceof cb4.h.WithIcon) {
            Label title = params.getDialogData().getTitle();
            Label body = params.getDialogData().getBody();
            k30.d.c cVar = k30.d.c.f107775a;
            k30.c.WithText withText = new k30.c.WithText(params.getDialogData().getPrimaryButtonData().getLabel(), null, 2, null);
            k30.a.b bVar = k30.a.b.f107765a;
            ButtonData buttonData = new ButtonData(null, null, bVar, withText, cVar, m.a(params.getDialogData().getPrimaryButtonData().getButtonState()), new er.a() { // from class: fb4.g
                @Override // er.a
                public final Object a() {
                    return l.v(this.f61049a, params);
                }
            }, 3, null);
            final DialogButtonTextData secondaryButtonData = params.getDialogData().getSecondaryButtonData();
            return new i40.a.WithIcon(this.dialogIconMapper.b(((cb4.h.WithIcon) type).getIconType()), null, title, body, null, buttonData, secondaryButtonData != null ? new ButtonData(null, null, bVar, new k30.c.WithText(secondaryButtonData.getLabel(), null, 2, null), cVar, m.a(secondaryButtonData.getButtonState()), new er.a() { // from class: fb4.h
                @Override // er.a
                public final Object a() {
                    return l.z(this.f61051a, secondaryButtonData);
                }
            }, 3, null) : null, null, params.getDialogData().f(), 146, null);
        }
        if (!fr.t.c(type, cb4.h.b.f24985a)) {
            throw new oq.p();
        }
        Label title2 = params.getDialogData().getTitle();
        Label body2 = params.getDialogData().getBody();
        k30.d.c cVar2 = k30.d.c.f107775a;
        k30.c.WithText withText2 = new k30.c.WithText(params.getDialogData().getPrimaryButtonData().getLabel(), null, 2, null);
        k30.a.b bVar2 = k30.a.b.f107765a;
        ButtonData buttonData2 = new ButtonData(null, null, bVar2, withText2, cVar2, m.a(params.getDialogData().getPrimaryButtonData().getButtonState()), new er.a() { // from class: fb4.i
            @Override // er.a
            public final Object a() {
                return l.F(this.f61053a, params);
            }
        }, 3, null);
        final DialogButtonTextData secondaryButtonData2 = params.getDialogData().getSecondaryButtonData();
        ButtonData buttonData3 = secondaryButtonData2 != null ? new ButtonData(null, null, bVar2, new k30.c.WithText(secondaryButtonData2.getLabel(), null, 2, null), cVar2, m.a(secondaryButtonData2.getButtonState()), new er.a() { // from class: fb4.j
            @Override // er.a
            public final Object a() {
                return l.H(this.f61055a, secondaryButtonData2);
            }
        }, 3, null) : null;
        final DialogButtonTextData tertiaryButtonData = params.getDialogData().getTertiaryButtonData();
        return new i40.a.WithText(null, title2, body2, null, buttonData2, buttonData3, tertiaryButtonData != null ? new ButtonData(null, null, bVar2, new k30.c.WithText(tertiaryButtonData.getLabel(), null, 2, null), cVar2, m.a(tertiaryButtonData.getButtonState()), new er.a() { // from class: fb4.k
            @Override // er.a
            public final Object a() {
                return l.J(this.f61057a, tertiaryButtonData);
            }
        }, 3, null) : null, params.getDialogData().f(), 9, null);
    }
}
