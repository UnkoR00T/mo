package pa3;

import fr.t;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import ka3.p;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import pq.v;
import vb3.ChosenParticipantsData;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpa3/g;", "Lxw/f;", "Lpa3/g$a;", "Lka3/p$a$d;", "Lmx/c;", "labelProvider", "Lpa3/i;", "singleCardMapper", "<init>", "(Lmx/c;Lpa3/i;)V", "Lvb3/a;", "Lz93/p;", "personalData", "Ln50/g;", "f", "(Lvb3/a;Lz93/p;)Ln50/g;", "Lmx/a;", "title", "Lxw/g;", "pesel", "e", "(Lmx/a;Liy/b0;)Ln50/g;", "params", "c", "(Lpa3/g$a;)Lka3/p$a$d;", "a", "Lmx/c;", "b", "Lpa3/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements xw.f<Params, p.a.Section> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i singleCardMapper;

    /* JADX INFO: renamed from: pa3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpa3/g$a;", "", "Lvb3/a;", "chosenParticipantsData", "Lz93/p;", "personalData", "<init>", "(Lvb3/a;Lz93/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvb3/a;", "()Lvb3/a;", "b", "Lz93/p;", "()Lz93/p;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ChosenParticipantsData chosenParticipantsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final TravelPersonalData personalData;

        public Params(ChosenParticipantsData chosenParticipantsData, TravelPersonalData travelPersonalData) {
            this.chosenParticipantsData = chosenParticipantsData;
            this.personalData = travelPersonalData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ChosenParticipantsData getChosenParticipantsData() {
            return this.chosenParticipantsData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final TravelPersonalData getPersonalData() {
            return this.personalData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.chosenParticipantsData, params.chosenParticipantsData) && t.c(this.personalData, params.personalData);
        }

        public int hashCode() {
            return (this.chosenParticipantsData.hashCode() * 31) + this.personalData.hashCode();
        }

        public String toString() {
            return "Params(chosenParticipantsData=" + this.chosenParticipantsData + ", personalData=" + this.personalData + ')';
        }
    }

    public g(mx.c cVar, i iVar) {
        this.labelProvider = cVar;
        this.singleCardMapper = iVar;
    }

    private final DefaultSingleCardData e(Label title, b0 pesel) {
        return this.singleCardMapper.b(new i.Params(null, title, null, this.labelProvider.e(r93.a.K, c0.e(pesel)), this.labelProvider.e(r93.a.K, dz.e.h(c0.e(pesel), 1, Label.INSTANCE.d())), 5, null));
    }

    private final DefaultSingleCardData f(ChosenParticipantsData chosenParticipantsData, TravelPersonalData travelPersonalData) {
        boolean isUserParticipant = chosenParticipantsData.getIsUserParticipant();
        Boolean boolValueOf = Boolean.valueOf(isUserParticipant);
        if (!isUserParticipant) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return e(this.labelProvider.e(r93.a.I, travelPersonalData.b()).n("userParticipantNameAndSurname"), travelPersonalData.getPesel());
        }
        return null;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p.a.Section b(Params params) {
        Label labelC = this.labelProvider.c(r93.a.f172475f1);
        List listR = v.r(f(params.getChosenParticipantsData(), params.getPersonalData()));
        List<TravelPersonalData> listB = params.getChosenParticipantsData().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        int i15 = 0;
        for (Object obj : listB) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            TravelPersonalData travelPersonalData = (TravelPersonalData) obj;
            arrayList.add(e(mx.b.b(travelPersonalData.b(), "childParticipantNameAndSurname_" + i15), travelPersonalData.getPesel()));
            i15 = i16;
        }
        return new p.a.Section(labelC, new CardListData(v.L0(listR, arrayList), null, false, null, null, 30, null));
    }
}
