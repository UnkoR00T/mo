package rc4;

import fr.t;
import g21.Action;
import g21.ConversationData;
import g21.Limits;
import g21.RateAnswerModel;
import g21.Source;
import g21.StaticMessages;
import g21.e;
import g21.f;
import g21.i;
import iy.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import ri0.BEAction;
import ri0.BEConversationData;
import ri0.BELimits;
import ri0.BERateAnswerModel;
import ri0.BESource;
import ri0.BEStaticMessages;
import ri0.g;
import ri0.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lg21/e;", "Lri0/f;", "f", "(Lg21/e;)Lri0/f;", "Lg21/d;", "Lri0/d;", "e", "(Lg21/d;)Lri0/d;", "Lg21/f$b$a;", "Lri0/g$b$a;", "h", "(Lg21/f$b$a;)Lri0/g$b$a;", "Lg21/f;", "Lri0/g;", "g", "(Lg21/f;)Lri0/g;", "Lri0/c;", "Lg21/c;", "k", "(Lri0/c;)Lg21/c;", "Lri0/i;", "Lg21/h;", "m", "(Lri0/i;)Lg21/h;", "Lri0/b;", "Lg21/b;", "j", "(Lri0/b;)Lg21/b;", "Lri0/h;", "Lg21/g;", "l", "(Lri0/h;)Lg21/g;", "Lri0/a;", "Lg21/a;", "i", "(Lri0/a;)Lg21/a;", "Lri0/j;", "Lg21/i;", "n", "(Lri0/j;)Lg21/i;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173166a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f173167b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f173168c;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f173166a = iArr;
            int[] iArr2 = new int[f.Selected.a.values().length];
            try {
                iArr2[f.Selected.a.LOWEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.Selected.a.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.Selected.a.MID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f.Selected.a.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.Selected.a.HIGHEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f173167b = iArr2;
            int[] iArr3 = new int[BEAction.EnumC4445a.values().length];
            try {
                iArr3[BEAction.EnumC4445a.SERVICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BEAction.EnumC4445a.DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BEAction.EnumC4445a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f173168c = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BERateAnswerModel e(RateAnswerModel rateAnswerModel) {
        return new BERateAnswerModel(f(rateAnswerModel.getRating()));
    }

    private static final ri0.f f(e eVar) {
        int i15 = a.f173166a[eVar.ordinal()];
        if (i15 == 1) {
            return ri0.f.POSITIVE;
        }
        if (i15 == 2) {
            return ri0.f.NEGATIVE;
        }
        if (i15 == 3) {
            return ri0.f.UNKNOWN;
        }
        throw new p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g g(f fVar) {
        if (fVar instanceof f.Selected) {
            return new g.Selected(h(((f.Selected) fVar).getOption()));
        }
        if (t.c(fVar, f.a.f69820a)) {
            return g.a.f174323a;
        }
        throw new p();
    }

    private static final g.Selected.a h(f.Selected.a aVar) {
        int i15 = a.f173167b[aVar.ordinal()];
        if (i15 == 1) {
            return g.Selected.a.LOWEST;
        }
        if (i15 == 2) {
            return g.Selected.a.LOW;
        }
        if (i15 == 3) {
            return g.Selected.a.MID;
        }
        if (i15 == 4) {
            return g.Selected.a.HIGH;
        }
        if (i15 == 5) {
            return g.Selected.a.HIGHEST;
        }
        throw new p();
    }

    private static final Action i(BEAction bEAction) {
        Action.EnumC1573a enumC1573a;
        String name = bEAction.getName();
        b0 url = bEAction.getUrl();
        int i15 = a.f173168c[bEAction.getActionType().ordinal()];
        if (i15 == 1) {
            enumC1573a = Action.EnumC1573a.SERVICE;
        } else if (i15 == 2) {
            enumC1573a = Action.EnumC1573a.DOCUMENT;
        } else {
            if (i15 != 3) {
                throw new p();
            }
            enumC1573a = Action.EnumC1573a.UNKNOWN;
        }
        return new Action(name, url, enumC1573a, bEAction.getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationData j(BEConversationData bEConversationData) {
        return new ConversationData(bEConversationData.getConversationId(), m(bEConversationData.getStaticMessages()), k(bEConversationData.getLimits()));
    }

    private static final Limits k(BELimits bELimits) {
        return new Limits(bELimits.getMaxQuestions(), bELimits.getMaxCharacters());
    }

    private static final Source l(BESource bESource) {
        return new Source(bESource.getName(), bESource.getUrl());
    }

    private static final StaticMessages m(BEStaticMessages bEStaticMessages) {
        return new StaticMessages(bEStaticMessages.getWelcomeMessage(), bEStaticMessages.getLimitExceededWarningMessage(), bEStaticMessages.getLimitExceededMessage(), bEStaticMessages.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i n(j jVar) {
        if (jVar instanceof j.Content) {
            return new i.Content(((j.Content) jVar).getContent());
        }
        if (!(jVar instanceof j.Metadata)) {
            throw new p();
        }
        j.Metadata metadata = (j.Metadata) jVar;
        b0 responseId = metadata.getResponseId();
        List<BESource> listE = metadata.e();
        ArrayList arrayList = new ArrayList(v.y(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(l((BESource) it.next()));
        }
        List<BEAction> listA = metadata.a();
        ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList2.add(i((BEAction) it4.next()));
        }
        return new i.Metadata(responseId, arrayList, arrayList2, metadata.f(), metadata.getShowRating(), metadata.getCurrentMessages());
    }
}
