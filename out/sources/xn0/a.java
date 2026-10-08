package xn0;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import un0.AvailableElectionSupport;
import un0.AvailableElectionSupports;
import un0.ElectionActionEligibility;
import un0.ElectionActionEligibilityProfileAccess;
import un0.ElectionSupportCommitteeData;
import un0.ElectionSupportsHistory;
import un0.ElectionSupportsHistoryGrantedSupport;
import un0.ElectionSupportsHistoryGrantedSupportsByAction;
import un0.e;
import un0.n;
import un0.o;
import yn0.AvailableElectionSupportsRequest;
import yn0.AvailableElectionSupportsResponse;
import yn0.AvailableElectionSupportsResponsePossibleElectionSupportDto;
import yn0.ElectionActionEligibilityResponse;
import yn0.ElectionActionEligibilityResponseProfileAccessDto;
import yn0.ElectionSupportsHistoryGrantedSupportDto;
import yn0.ElectionSupportsHistoryGrantedSupportsByActionDto;
import yn0.ElectionSupportsHistoryRequest;
import yn0.ElectionSupportsHistoryResponse;
import yn0.PossibleElectionSupportDtoElectionCommitteeDto;
import yn0.f;
import yn0.g;
import yn0.h;
import yn0.i;
import yn0.j;
import yn0.p;
import yn0.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010+\u001a\u0011\u0010.\u001a\u00020-*\u00020,¢\u0006\u0004\b.\u0010/\u001a\u0011\u00102\u001a\u000201*\u000200¢\u0006\u0004\b2\u00103\u001a\u0011\u00106\u001a\u000205*\u000204¢\u0006\u0004\b6\u00107\u001a\u0011\u0010:\u001a\u000209*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u0011\u0010B\u001a\u00020A*\u00020@¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Lyn0/d;", "Lun0/c;", "c", "(Lyn0/d;)Lun0/c;", "Lyn0/e;", "Lun0/d;", "d", "(Lyn0/e;)Lun0/d;", "Lyn0/p;", "Lun0/n;", "n", "(Lyn0/p;)Lun0/n;", "Lyn0/q;", "Lun0/o;", "o", "(Lyn0/q;)Lun0/o;", "Lyn0/b;", "Lun0/b;", "b", "(Lyn0/b;)Lun0/b;", "Lyn0/c;", "Lun0/a;", "a", "(Lyn0/c;)Lun0/a;", "Lyn0/o;", "Lun0/g;", "g", "(Lyn0/o;)Lun0/g;", "Lyn0/f;", "Lun0/e;", "e", "(Lyn0/f;)Lun0/e;", "Lbo0/a;", "Lyn0/a;", "p", "(Ljava/lang/String;)Lyn0/a;", "Lbo0/b;", "Lyn0/m;", "q", "(Ljava/lang/String;)Lyn0/m;", "Lyn0/n;", "Lun0/k;", "k", "(Lyn0/n;)Lun0/k;", "Lyn0/l;", "Lun0/m;", "m", "(Lyn0/l;)Lun0/m;", "Lyn0/k;", "Lun0/l;", "l", "(Lyn0/k;)Lun0/l;", "Lyn0/g;", "Lun0/f;", "f", "(Lyn0/g;)Lun0/f;", "Lyn0/h;", "Lun0/h;", "h", "(Lyn0/h;)Lun0/h;", "Lyn0/i;", "Lun0/i;", "i", "(Lyn0/i;)Lun0/i;", "Lyn0/j;", "Lun0/j;", "j", "(Lyn0/j;)Lun0/j;", "electoralsupportservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: xn0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C5869a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f219952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f219953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f219954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f219955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f219956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f219957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f219958g;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f219952a = iArr;
            int[] iArr2 = new int[q.values().length];
            try {
                iArr2[q.GIVE_SUPPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[q.HISTORY_OF_SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q.RESULTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f219953b = iArr2;
            int[] iArr3 = new int[f.values().length];
            try {
                iArr3[f.PRESIDENTIAL_ELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[f.SEJM_ELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[f.SENATE_ELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[f.EUROPEAN_PARLIAMENT_ELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[f.SENATE_SUPPLEMENTARY_ELECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[f.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            f219954c = iArr3;
            int[] iArr4 = new int[g.values().length];
            try {
                iArr4[g.MOBYWATEL_APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[g.MOBYWATEL_GOV_PL.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[g.PAPER_FORM.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[g.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            f219955d = iArr4;
            int[] iArr5 = new int[h.values().length];
            try {
                iArr5[h.PERSON_NOT_FOUND_IN_CRW.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[h.INVALID_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[h.INVALID_ELECTORAL_DISTRICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[h.INACTIVE_SUPPORT_SUBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[h.EARLIER_SUPPORT_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[h.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            f219956e = iArr5;
            int[] iArr6 = new int[i.values().length];
            try {
                iArr6[i.PROCESSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[i.ACCEPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[i.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[i.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            f219957f = iArr6;
            int[] iArr7 = new int[j.values().length];
            try {
                iArr7[j.CANDIDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr7[j.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr7[j.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f219958g = iArr7;
        }
    }

    public static final AvailableElectionSupport a(AvailableElectionSupportsResponsePossibleElectionSupportDto availableElectionSupportsResponsePossibleElectionSupportDto) {
        List<PossibleElectionSupportDtoElectionCommitteeDto> listB = availableElectionSupportsResponsePossibleElectionSupportDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(g((PossibleElectionSupportDtoElectionCommitteeDto) it.next()));
        }
        return new AvailableElectionSupport(arrayList, availableElectionSupportsResponsePossibleElectionSupportDto.getElectionActionDate().toString(), availableElectionSupportsResponsePossibleElectionSupportDto.getElectionActionId(), availableElectionSupportsResponsePossibleElectionSupportDto.getElectionActionName(), e(availableElectionSupportsResponsePossibleElectionSupportDto.getElectionActionType()), availableElectionSupportsResponsePossibleElectionSupportDto.getSupportDeadline().toString(), availableElectionSupportsResponsePossibleElectionSupportDto.getCommitteeSubjectDistrictName());
    }

    public static final AvailableElectionSupports b(AvailableElectionSupportsResponse availableElectionSupportsResponse) {
        boolean hasVotingRights = availableElectionSupportsResponse.getHasVotingRights();
        List<AvailableElectionSupportsResponsePossibleElectionSupportDto> listB = availableElectionSupportsResponse.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(a((AvailableElectionSupportsResponsePossibleElectionSupportDto) it.next()));
        }
        return new AvailableElectionSupports(hasVotingRights, arrayList);
    }

    public static final ElectionActionEligibility c(ElectionActionEligibilityResponse electionActionEligibilityResponse) {
        boolean isAdult = electionActionEligibilityResponse.getIsAdult();
        ElectionActionEligibilityResponseProfileAccessDto profileAccess = electionActionEligibilityResponse.getProfileAccess();
        return new ElectionActionEligibility(isAdult, profileAccess != null ? d(profileAccess) : null);
    }

    public static final ElectionActionEligibilityProfileAccess d(ElectionActionEligibilityResponseProfileAccessDto electionActionEligibilityResponseProfileAccessDto) {
        String jwtToken = electionActionEligibilityResponseProfileAccessDto.getJwtToken();
        List<q> listB = electionActionEligibilityResponseProfileAccessDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(o((q) it.next()));
        }
        return new ElectionActionEligibilityProfileAccess(jwtToken, arrayList, n(electionActionEligibilityResponseProfileAccessDto.getTrustedProfileStatus()));
    }

    public static final e e(f fVar) {
        switch (C5869a.f219954c[fVar.ordinal()]) {
            case 1:
                return e.PRESIDENTIAL_ELECTION;
            case 2:
                return e.SEJM_ELECTION;
            case 3:
                return e.SENATE_ELECTION;
            case 4:
                return e.EUROPEAN_PARLIAMENT_ELECTION;
            case 5:
                return e.SENATE_SUPPLEMENTARY_ELECTION;
            case 6:
                return e.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final un0.f f(g gVar) {
        int i15 = C5869a.f219955d[gVar.ordinal()];
        if (i15 == 1) {
            return un0.f.MOBYWATEL_APPLICATION;
        }
        if (i15 == 2) {
            return un0.f.MOBYWATEL_GOV_PL;
        }
        if (i15 == 3) {
            return un0.f.PAPER_FORM;
        }
        if (i15 == 4) {
            return un0.f.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final ElectionSupportCommitteeData g(PossibleElectionSupportDtoElectionCommitteeDto possibleElectionSupportDtoElectionCommitteeDto) {
        return new ElectionSupportCommitteeData(possibleElectionSupportDtoElectionCommitteeDto.getCommitteeId(), possibleElectionSupportDtoElectionCommitteeDto.getCommitteeName(), possibleElectionSupportDtoElectionCommitteeDto.getCommitteeNameAddress(), possibleElectionSupportDtoElectionCommitteeDto.getCommitteeSubjectElectionDistrictId(), possibleElectionSupportDtoElectionCommitteeDto.getCommitteeSubjectId(), possibleElectionSupportDtoElectionCommitteeDto.getCommitteeSubjectName(), possibleElectionSupportDtoElectionCommitteeDto.getCommitteeSubjectType());
    }

    public static final un0.h h(h hVar) {
        switch (C5869a.f219956e[hVar.ordinal()]) {
            case 1:
                return un0.h.PERSON_NOT_FOUND_IN_CRW;
            case 2:
                return un0.h.INVALID_DATA;
            case 3:
                return un0.h.INVALID_ELECTORAL_DISTRICT;
            case 4:
                return un0.h.INACTIVE_SUPPORT_SUBJECT;
            case 5:
                return un0.h.EARLIER_SUPPORT_EXISTS;
            case 6:
                return un0.h.UNKNOWN;
            default:
                throw new oq.p();
        }
    }

    public static final un0.i i(i iVar) {
        int i15 = C5869a.f219957f[iVar.ordinal()];
        if (i15 == 1) {
            return un0.i.PROCESSING;
        }
        if (i15 == 2) {
            return un0.i.ACCEPTED;
        }
        if (i15 == 3) {
            return un0.i.REJECTED;
        }
        if (i15 == 4) {
            return un0.i.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final un0.j j(j jVar) {
        int i15 = C5869a.f219958g[jVar.ordinal()];
        if (i15 == 1) {
            return un0.j.CANDIDATE;
        }
        if (i15 == 2) {
            return un0.j.LIST;
        }
        if (i15 == 3) {
            return un0.j.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final ElectionSupportsHistory k(ElectionSupportsHistoryResponse electionSupportsHistoryResponse) {
        List<ElectionSupportsHistoryGrantedSupportsByActionDto> listA = electionSupportsHistoryResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(m((ElectionSupportsHistoryGrantedSupportsByActionDto) it.next()));
        }
        return new ElectionSupportsHistory(arrayList, electionSupportsHistoryResponse.getLastUpdatedAt());
    }

    public static final ElectionSupportsHistoryGrantedSupport l(ElectionSupportsHistoryGrantedSupportDto electionSupportsHistoryGrantedSupportDto) {
        e eVarE = e(electionSupportsHistoryGrantedSupportDto.getActionType());
        un0.f fVarF = f(electionSupportsHistoryGrantedSupportDto.getChannel());
        String committeeName = electionSupportsHistoryGrantedSupportDto.getCommitteeName();
        String electoralDistrictName = electionSupportsHistoryGrantedSupportDto.getElectoralDistrictName();
        OffsetDateTime grantedAt = electionSupportsHistoryGrantedSupportDto.getGrantedAt();
        un0.i iVarI = i(electionSupportsHistoryGrantedSupportDto.getStatus());
        String subjectName = electionSupportsHistoryGrantedSupportDto.getSubjectName();
        un0.j jVarJ = j(electionSupportsHistoryGrantedSupportDto.getSubjectType());
        String supportId = electionSupportsHistoryGrantedSupportDto.getSupportId();
        h rejectionReason = electionSupportsHistoryGrantedSupportDto.getRejectionReason();
        return new ElectionSupportsHistoryGrantedSupport(eVarE, fVarF, committeeName, electoralDistrictName, grantedAt, iVarI, subjectName, jVarJ, supportId, rejectionReason != null ? h(rejectionReason) : null);
    }

    public static final ElectionSupportsHistoryGrantedSupportsByAction m(ElectionSupportsHistoryGrantedSupportsByActionDto electionSupportsHistoryGrantedSupportsByActionDto) {
        String actionName = electionSupportsHistoryGrantedSupportsByActionDto.getActionName();
        List<ElectionSupportsHistoryGrantedSupportDto> listB = electionSupportsHistoryGrantedSupportsByActionDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(l((ElectionSupportsHistoryGrantedSupportDto) it.next()));
        }
        return new ElectionSupportsHistoryGrantedSupportsByAction(actionName, arrayList);
    }

    public static final n n(p pVar) {
        int i15 = C5869a.f219952a[pVar.ordinal()];
        if (i15 == 1) {
            return n.AVAILABLE;
        }
        if (i15 == 2) {
            return n.UNAVAILABLE;
        }
        if (i15 == 3) {
            return n.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final o o(q qVar) {
        int i15 = C5869a.f219953b[qVar.ordinal()];
        if (i15 == 1) {
            return o.GIVE_SUPPORT;
        }
        if (i15 == 2) {
            return o.HISTORY_OF_SUPPORT;
        }
        if (i15 == 3) {
            return o.RESULTS;
        }
        if (i15 == 4) {
            return o.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final AvailableElectionSupportsRequest p(String str) {
        return new AvailableElectionSupportsRequest(str);
    }

    public static final ElectionSupportsHistoryRequest q(String str) {
        return new ElectionSupportsHistoryRequest(str);
    }
}
