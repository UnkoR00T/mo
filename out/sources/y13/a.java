package y13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import xw.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ly13/a;", "Lxw/f;", "Ll13/a;", "Lz13/a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "data", "c", "(Ll13/a;)Lz13/a;", "a", "Lmx/c;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<l13.a, z13.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public a(mx.c cVar) {
        this.labelProvider = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:279:0x0580 A[PHI: r16
      0x0580: PHI (r16v51 java.lang.String) = 
      (r16v1 java.lang.String)
      (r16v2 java.lang.String)
      (r16v3 java.lang.String)
      (r16v4 java.lang.String)
      (r16v5 java.lang.String)
      (r16v6 java.lang.String)
      (r16v7 java.lang.String)
      (r16v8 java.lang.String)
      (r16v9 java.lang.String)
      (r16v10 java.lang.String)
      (r16v11 java.lang.String)
      (r16v12 java.lang.String)
      (r16v13 java.lang.String)
      (r16v14 java.lang.String)
      (r16v15 java.lang.String)
      (r16v16 java.lang.String)
      (r16v17 java.lang.String)
      (r16v18 java.lang.String)
      (r16v19 java.lang.String)
      (r16v20 java.lang.String)
      (r16v21 java.lang.String)
      (r16v22 java.lang.String)
      (r16v23 java.lang.String)
      (r16v24 java.lang.String)
      (r16v25 java.lang.String)
      (r16v26 java.lang.String)
      (r16v27 java.lang.String)
      (r16v28 java.lang.String)
      (r16v29 java.lang.String)
      (r16v30 java.lang.String)
      (r16v31 java.lang.String)
      (r16v32 java.lang.String)
      (r16v33 java.lang.String)
      (r16v34 java.lang.String)
      (r16v35 java.lang.String)
      (r16v36 java.lang.String)
      (r16v37 java.lang.String)
      (r16v38 java.lang.String)
      (r16v39 java.lang.String)
      (r16v40 java.lang.String)
      (r16v41 java.lang.String)
      (r16v42 java.lang.String)
      (r16v43 java.lang.String)
      (r16v44 java.lang.String)
      (r16v45 java.lang.String)
      (r16v46 java.lang.String)
      (r16v47 java.lang.String)
      (r16v48 java.lang.String)
      (r16v52 java.lang.String)
     binds: [B:278:0x057e, B:274:0x056a, B:270:0x0556, B:266:0x0542, B:262:0x052e, B:258:0x051a, B:254:0x0504, B:250:0x04ee, B:246:0x04d8, B:242:0x04c2, B:238:0x04ae, B:234:0x049a, B:230:0x0484, B:226:0x0470, B:222:0x045a, B:218:0x0446, B:214:0x0430, B:210:0x041a, B:206:0x0404, B:202:0x03f0, B:198:0x03da, B:194:0x03c4, B:190:0x03ae, B:186:0x0398, B:182:0x0384, B:178:0x036e, B:174:0x0358, B:170:0x0344, B:166:0x032e, B:162:0x031a, B:158:0x0304, B:154:0x02ee, B:150:0x02d8, B:146:0x02c2, B:142:0x02ac, B:138:0x0296, B:134:0x0280, B:130:0x026a, B:126:0x0254, B:122:0x023e, B:118:0x0228, B:114:0x0212, B:110:0x01fe, B:106:0x01ea, B:102:0x01d4, B:98:0x01be, B:94:0x01a8, B:90:0x0192, B:84:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:335:0x0671  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public z13.a b(l13.a data) {
        String str;
        Label labelC;
        Label labelC2;
        Label labelC3;
        int i15;
        if (data instanceof l13.a.Group) {
            l13.a.Group group = (l13.a.Group) data;
            String groupId = group.getGroupId();
            switch (group.getGroupId()) {
                case "documents_and_data":
                    labelC3 = this.labelProvider.c(g13.c.X);
                    break;
                case "tools_and_clothes":
                    labelC3 = this.labelProvider.c(g13.c.R0);
                    break;
                case "first_aid_kit":
                    labelC3 = this.labelProvider.c(g13.c.f69694c0);
                    break;
                case "lighting_and_connectivity":
                    labelC3 = this.labelProvider.c(g13.c.f69730o0);
                    break;
                case "water":
                    labelC3 = this.labelProvider.c(g13.c.T0);
                    break;
                case "first_aid":
                    labelC3 = this.labelProvider.c(g13.c.f69691b0);
                    break;
                case "personal_hygiene":
                    labelC3 = this.labelProvider.c(g13.c.f69754w0);
                    break;
                case "medicines":
                    labelC3 = this.labelProvider.c(g13.c.f69733p0);
                    break;
                default:
                    labelC3 = Label.INSTANCE.c();
                    break;
            }
            switch (group.getGroupId()) {
                case "documents_and_data":
                    i15 = jz.a.f106834o1;
                    break;
                case "tools_and_clothes":
                    i15 = jz.a.f106862s1;
                    break;
                case "first_aid_kit":
                    i15 = jz.a.f106848q1;
                    break;
                case "lighting_and_connectivity":
                    i15 = jz.a.f106855r1;
                    break;
                case "water":
                    i15 = jz.a.f106841p1;
                    break;
                case "first_aid":
                    i15 = jz.a.Q;
                    break;
                case "personal_hygiene":
                    i15 = jz.a.P;
                    break;
                case "medicines":
                    i15 = jz.a.O;
                    break;
                default:
                    i15 = 0;
                    break;
            }
            List<l13.a> listB = group.b();
            ArrayList arrayList = new ArrayList(v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList.add(b((l13.a) it.next()));
            }
            return new z13.a.Group(groupId, labelC3, i15, arrayList);
        }
        if (!(data instanceof l13.a.Item)) {
            throw new p();
        }
        l13.a.Item item = (l13.a.Item) data;
        String itemId = item.getItemId();
        String itemId2 = item.getItemId();
        switch (itemId2.hashCode()) {
            case -2047283041:
                str = itemId;
                if (!itemId2.equals("charged_phone")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.N);
                }
                break;
            case -1999379725:
                str = itemId;
                if (!itemId2.equals("wet_wipes")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.W0);
                }
                break;
            case -1865184503:
                str = itemId;
                if (!itemId2.equals("bandages")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.F);
                }
                break;
            case -1680362331:
                str = itemId;
                if (!itemId2.equals("charged_power_bank")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.O);
                }
                break;
            case -1659163703:
                str = itemId;
                if (!itemId2.equals("health_information")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69709h0);
                }
                break;
            case -1555456733:
                str = itemId;
                if (!itemId2.equals("contact_details")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.R);
                }
                break;
            case -1376255111:
                str = itemId;
                if (!itemId2.equals("burn_bandages")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.K);
                }
                break;
            case -1307713918:
                str = itemId;
                if (!itemId2.equals("antidiarrheal")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.D);
                }
                break;
            case -1258600078:
                str = itemId;
                if (!itemId2.equals("toothbrush")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.S0);
                }
                break;
            case -1183073498:
                str = itemId;
                if (!itemId2.equals("flashlight")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69697d0);
                }
                break;
            case -1138764450:
                str = itemId;
                if (!itemId2.equals("bottle_water")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.I);
                }
                break;
            case -1136962413:
                str = itemId;
                if (!itemId2.equals("antiemetic")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.E);
                }
                break;
            case -1087026712:
                str = itemId;
                if (!itemId2.equals("ownership_documents")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69739r0);
                }
                break;
            case -1067610650:
                str = itemId;
                if (!itemId2.equals("thermometer")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.O0);
                }
                break;
            case -1039584170:
                str = itemId;
                if (!itemId2.equals("pendrive_usb")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69748u0);
                }
                break;
            case -1001647961:
                str = itemId;
                if (!itemId2.equals("water_purification_tablets")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.V0);
                }
                break;
            case -944276736:
                str = itemId;
                if (!itemId2.equals("bleeding_bandages")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.H);
                }
                break;
            case -655921129:
                str = itemId;
                if (!itemId2.equals("scissors")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.H0);
                }
                break;
            case -478779016:
                str = itemId;
                if (!itemId2.equals("devices_cables")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.T);
                }
                break;
            case -466050311:
                str = itemId;
                if (!itemId2.equals("disposable_gloves")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.W);
                }
                break;
            case -157946345:
                str = itemId;
                if (!itemId2.equals("birth_certificate")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.G);
                }
                break;
            case -96445764:
                str = itemId;
                if (!itemId2.equals("pocket_knife")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.A0);
                }
                break;
            case -62846542:
                str = itemId;
                if (!itemId2.equals("painkillers")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69745t0);
                }
                break;
            case 3046195:
                str = itemId;
                if (!itemId2.equals("cash")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.L);
                }
                break;
            case 20449322:
                str = itemId;
                if (!itemId2.equals("anti_inflammatory")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.C);
                }
                break;
            case 32245971:
                str = itemId;
                if (!itemId2.equals("water_filters")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.U0);
                }
                break;
            case 52440461:
                str = itemId;
                if (!itemId2.equals("ready_to_eat_food")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.F0);
                }
                break;
            case 98128710:
                str = itemId;
                if (!itemId2.equals("gauze")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69706g0);
                }
                break;
            case 108270587:
                str = itemId;
                if (!itemId2.equals("radio")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.C0);
                }
                break;
            case 116719891:
                str = itemId;
                if (!itemId2.equals("rainwear")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.E0);
                }
                break;
            case 170546243:
                str = itemId;
                if (!itemId2.equals("lighter")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69727n0);
                }
                break;
            case 197215092:
                str = itemId;
                if (!itemId2.equals("sleeping_bag")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.K0);
                }
                break;
            case 197225676:
                str = itemId;
                if (!itemId2.equals("sleeping_mat")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.L0);
                }
                break;
            case 257700879:
                str = itemId;
                if (!itemId2.equals("disinfectants")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.V);
                }
                break;
            case 466887012:
                str = itemId;
                if (!itemId2.equals("season_clothing")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.I0);
                }
                break;
            case 572289591:
                str = itemId;
                if (!itemId2.equals("insurance_policy")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69724m0);
                }
                break;
            case 664974341:
                str = itemId;
                if (!itemId2.equals("personal_medications")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69763z0);
                }
                break;
            case 739062846:
                str = itemId;
                if (!itemId2.equals("charger")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.P);
                }
                break;
            case 872881898:
                str = itemId;
                if (!itemId2.equals("printed_maps")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.B0);
                }
                break;
            case 978636732:
                str = itemId;
                if (!itemId2.equals("anti_dust_mask")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.B);
                }
                break;
            case 1130609667:
                str = itemId;
                if (!itemId2.equals("spare_batteries")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.M0);
                }
                break;
            case 1169575177:
                str = itemId;
                if (!itemId2.equals("alternative_connectivity")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69762z);
                }
                break;
            case 1434316745:
                str = itemId;
                if (!itemId2.equals("driving_license")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.Z);
                }
                break;
            case 1652301748:
                str = itemId;
                if (!itemId2.equals("id_card")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69715j0);
                }
                break;
            case 1689080660:
                str = itemId;
                if (!itemId2.equals("thermal_foil")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.N0);
                }
                break;
            case 1690185525:
                str = itemId;
                if (!itemId2.equals("garbage_bags")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69703f0);
                }
                break;
            case 1732553946:
                str = itemId;
                if (!itemId2.equals("toilet_paper")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.Q0);
                }
                break;
            case 2008943701:
                str = itemId;
                if (!itemId2.equals("important_personal_item")) {
                    labelC = Label.INSTANCE.c();
                } else {
                    labelC = this.labelProvider.c(g13.c.f69718k0);
                }
                break;
            case 2143247033:
                if (itemId2.equals("personal_hygiene_products")) {
                    str = itemId;
                    labelC = this.labelProvider.c(g13.c.f69757x0);
                    break;
                }
            default:
                str = itemId;
                labelC = Label.INSTANCE.c();
                break;
        }
        switch (item.getItemId()) {
            case "health_information":
                labelC2 = this.labelProvider.c(g13.c.f69712i0);
                break;
            case "flashlight":
                labelC2 = this.labelProvider.c(g13.c.f69700e0);
                break;
            case "bottle_water":
                labelC2 = this.labelProvider.c(g13.c.J);
                break;
            case "ownership_documents":
                labelC2 = this.labelProvider.c(g13.c.f69742s0);
                break;
            case "pendrive_usb":
                labelC2 = this.labelProvider.c(g13.c.f69751v0);
                break;
            case "devices_cables":
                labelC2 = this.labelProvider.c(g13.c.U);
                break;
            case "cash":
                labelC2 = this.labelProvider.c(g13.c.M);
                break;
            case "ready_to_eat_food":
                labelC2 = this.labelProvider.c(g13.c.G0);
                break;
            case "radio":
                labelC2 = this.labelProvider.c(g13.c.D0);
                break;
            case "alternative_connectivity":
                labelC2 = this.labelProvider.c(g13.c.A);
                break;
            case "driving_license":
                labelC2 = this.labelProvider.c(g13.c.f69688a0);
                break;
            case "important_personal_item":
                labelC2 = this.labelProvider.c(g13.c.f69721l0);
                break;
            case "personal_hygiene_products":
                labelC2 = this.labelProvider.c(g13.c.f69760y0);
                break;
            default:
                labelC2 = null;
                break;
        }
        return new z13.a.Item(str, labelC, labelC2);
    }
}
