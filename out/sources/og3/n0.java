package og3;

import df3.VehicleDetailsData;
import fe3.NewStatement;
import fe3.RecoveredCollision;
import fe3.y4;
import gf3.DownloadPdfSetupData;
import gg3.DescriptionPreparationWaitingModel;
import java.util.List;
import jb4.ErrorActionData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import se3.InsuranceDetailsData;
import sv0.BEVehicleData;
import sv0.Insurance;
import sv0.ProcessId;
import sv0.StatementReady;
import sv0.Uploader;
import tv0.BENewCollisionData;
import tv0.BEPersonalData;
import tv0.BESavedDraftCollision;
import tv0.BEVehicleCollisionDescriptionConception;
import tv0.BEVehicleDataWithType;
import tv0.BEVehiclesPages;
import tv0.Description;
import tv0.YourDetails;
import ve3.PersonalDetailsData;
import vy.Coordinates;
import ye3.PhotosDetailsSetupData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B³\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u0002032\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u000203H\u0016¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000203H\u0016¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u000203H\u0016¢\u0006\u0004\b=\u0010;J\u0017\u0010@\u001a\u0002032\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u000203H\u0016¢\u0006\u0004\bB\u0010;J\u0017\u0010E\u001a\u0002032\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u000203H\u0016¢\u0006\u0004\bG\u0010;J\u000f\u0010H\u001a\u000203H\u0016¢\u0006\u0004\bH\u0010;J\u000f\u0010I\u001a\u000203H\u0016¢\u0006\u0004\bI\u0010;J\u000f\u0010J\u001a\u000203H\u0016¢\u0006\u0004\bJ\u0010;J\u0017\u0010M\u001a\u0002032\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u0002032\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u0002032\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u0002032\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u0002032\u0006\u00102\u001a\u00020[H\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u0002032\u0006\u0010D\u001a\u00020C2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u0002032\u0006\u00102\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u0015\u0010g\u001a\b\u0012\u0004\u0012\u00020f0eH\u0016¢\u0006\u0004\bg\u0010hJ\u0018\u0010i\u001a\u0002032\u0006\u0010D\u001a\u00020CH\u0096@¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u000203H\u0014¢\u0006\u0004\bk\u0010;J$\u0010o\u001a\u0002032\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020m0lH\u0096A¢\u0006\u0004\bo\u0010pJ$\u0010r\u001a\u0002032\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020q0lH\u0096A¢\u0006\u0004\br\u0010pJ$\u0010t\u001a\u0002032\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020s0lH\u0096A¢\u0006\u0004\bt\u0010pJ\u0018\u0010w\u001a\u0002032\u0006\u0010v\u001a\u00020uH\u0096A¢\u0006\u0004\bw\u0010xJ\u0018\u0010{\u001a\u0002032\u0006\u0010z\u001a\u00020yH\u0096A¢\u0006\u0004\b{\u0010|J\u0018\u0010}\u001a\u0002032\u0006\u0010D\u001a\u00020CH\u0096A¢\u0006\u0004\b}\u0010jJ&\u0010\u0080\u0001\u001a\u0002032\u0012\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020~\u0012\u0004\u0012\u00020~0lH\u0096A¢\u0006\u0005\b\u0080\u0001\u0010pJ\u001f\u0010\u0083\u0001\u001a\u0002032\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0096A¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J)\u0010\u0087\u0001\u001a\u0002032\u0015\u0010\u0086\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0085\u0001\u0012\u0005\u0012\u00030\u0085\u00010lH\u0096A¢\u0006\u0005\b\u0087\u0001\u0010pJ\u0013\u0010\u0088\u0001\u001a\u000203H\u0096A¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001d\u0010\u008c\u0001\u001a\u0002032\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0096A¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001d\u0010\u0090\u0001\u001a\u0002032\b\u0010\u008f\u0001\u001a\u00030\u008e\u0001H\u0096A¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J)\u0010\u0094\u0001\u001a\u0002032\u0015\u0010\u0093\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0092\u0001\u0012\u0005\u0012\u00030\u0092\u00010lH\u0096A¢\u0006\u0005\b\u0094\u0001\u0010pJ$\u0010\u0098\u0001\u001a\u0002032\u000f\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u0001H\u0096A¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001f\u0010\u009c\u0001\u001a\u0002032\n\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u0001H\u0096A¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J-\u0010\u009f\u0001\u001a\u0002032\u0019\u0010\u009e\u0001\u001a\u0014\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u00010lH\u0096A¢\u0006\u0005\b\u009f\u0001\u0010pJ\u001d\u0010¢\u0001\u001a\u0002032\b\u0010¡\u0001\u001a\u00030 \u0001H\u0096A¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001d\u0010¦\u0001\u001a\u0002032\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0096A¢\u0006\u0006\b¦\u0001\u0010§\u0001J1\u0010¬\u0001\u001a\u0002032\b\u0010¥\u0001\u001a\u00030¨\u00012\b\u0010ª\u0001\u001a\u00030©\u00012\b\u0010«\u0001\u001a\u00030©\u0001H\u0096A¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J \u0010®\u0001\u001a\u0005\u0018\u00010\u0096\u00012\b\u0010¥\u0001\u001a\u00030¤\u0001H\u0096A¢\u0006\u0006\b®\u0001\u0010§\u0001J\u001d\u0010±\u0001\u001a\u0002032\b\u0010°\u0001\u001a\u00030¯\u0001H\u0082@¢\u0006\u0006\b±\u0001\u0010²\u0001J\u001d\u0010µ\u0001\u001a\u0002032\b\u0010´\u0001\u001a\u00030³\u0001H\u0082@¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u001c\u0010¸\u0001\u001a\u0002032\u0007\u0010?\u001a\u00030·\u0001H\u0082@¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001d\u0010º\u0001\u001a\u0002032\b\u00107\u001a\u0004\u0018\u000106H\u0082@¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001d\u0010¾\u0001\u001a\u0002032\b\u0010½\u0001\u001a\u00030¼\u0001H\u0082@¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001c\u0010Á\u0001\u001a\u0002032\b\u0010½\u0001\u001a\u00030À\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001d\u0010Ä\u0001\u001a\u0002032\b\u0010´\u0001\u001a\u00030Ã\u0001H\u0082@¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u001d\u0010Ç\u0001\u001a\u0002032\b\u0010´\u0001\u001a\u00030Æ\u0001H\u0082@¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u001c\u0010Ë\u0001\u001a\u0002032\b\u0010Ê\u0001\u001a\u00030É\u0001H\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u001c\u0010Ï\u0001\u001a\u0002032\b\u0010Î\u0001\u001a\u00030Í\u0001H\u0002¢\u0006\u0006\bÏ\u0001\u0010Ð\u0001J7\u0010Õ\u0001\u001a\u0002032\b\u0010Ò\u0001\u001a\u00030Ñ\u00012\u000b\b\u0002\u0010Ó\u0001\u001a\u0004\u0018\u00010\u00032\u000b\b\u0002\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003H\u0082@¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\u0017\u0010Ø\u0001\u001a\u000203*\u00030×\u0001H\u0002¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0017\u0010Û\u0001\u001a\u00030Ú\u0001*\u00020\u0002H\u0002¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010à\u0001R\u0016\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0016\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R\u0016\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ì\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ð\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010ñ\u0001R\u0016\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bô\u0001\u0010õ\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0002\u0010\u0081\u0002R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0017\u0010\u0086\u0002\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0002\u0010\u0085\u0002R3\u0010\u008d\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0087\u00028\u0014X\u0094\u0004¢\u0006\u0017\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u0012\u0005\b\u008c\u0002\u0010;\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R&\u0010\u0093\u0002\u001a\n\u0012\u0005\u0012\u00030\u008f\u00020\u008e\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b<\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R&\u0010\u0094\u0002\u001a\n\u0012\u0005\u0012\u00030×\u00010\u008e\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b{\u0010\u0090\u0002\u001a\u0006\bç\u0001\u0010\u0092\u0002R.\u0010\u009b\u0002\u001a\n\u0012\u0005\u0012\u00030Ú\u00010\u0095\u00028\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\b\u0096\u0002\u0010\u0097\u0002\u0012\u0005\b\u009a\u0002\u0010;\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002R$\u0010D\u001a\u0010\u0012\u0005\u0012\u00030Ñ\u0001\u0012\u0004\u0012\u00020C0\u009c\u00028\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\bã\u0001\u0010\u009d\u0002R\u0017\u0010 \u0002\u001a\u00020m8\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001b\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b¡\u0002\u0010hR\u0017\u0010¤\u0002\u001a\u00020~8\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¢\u0002\u0010£\u0002R\u001a\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¥\u0002\u0010¦\u0002R\u001d\u0010©\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00020e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b¨\u0002\u0010hR\u0018\u0010¬\u0002\u001a\u00030§\u00028\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\bª\u0002\u0010«\u0002R\u001d\u0010¯\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00020e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b®\u0002\u0010hR\u0018\u0010²\u0002\u001a\u00030\u00ad\u00028\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b°\u0002\u0010±\u0002R\u001d\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b³\u0002\u0010hR\u0018\u0010¶\u0002\u001a\u00030\u0092\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b´\u0002\u0010µ\u0002R\u001f\u0010\u009b\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u009a\u00010e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b·\u0002\u0010hR\u001a\u0010º\u0002\u001a\u0005\u0018\u00010\u009a\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b¸\u0002\u0010¹\u0002R$\u0010¼\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00010e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\b»\u0002\u0010hR\u001f\u0010¿\u0002\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010\u0095\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002R\u001f\u0010Â\u0002\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010À\u00020e8\u0016X\u0096\u0005¢\u0006\u0007\u001a\u0005\bÁ\u0002\u0010hR\u000b\u0010z\u001a\u00020y8\u0016X\u0096\u0005R\u000b\u0010v\u001a\u00020u8\u0016X\u0096\u0005¨\u0006Ã\u0002"}, d2 = {"Log3/n0;", "Ll00/g;", "Log3/y;", "Log3/w;", "Log3/z;", "Log3/x;", "Log3/a;", "Lyy/a;", "stateMachineFactory", "Lpg3/c;", "screenMapper", "Lpg3/b;", "newCollisionExitDialogMapper", "Lbe3/a;", "awaitConfirmationInitialInfoUC", "Law0/f0;", "startAwaitConfirmationStatementUC", "Lae3/x;", "subscribeDescriptionUC", "Law0/a0;", "monitorConfirmationStatementStatusUC", "Law0/o;", "cancelAwaitConfirmationStatementUC", "Lae3/r;", "saveNewCollisionDataUC", "Lae3/i;", "getSavedCollisionDataUC", "Lmx/c;", "labelProvider", "Lib4/c;", "domainErrorMapper", "dataSourceContract", "Law0/d;", "beGetReadyToSignStatementDataUC", "Lac4/a;", "loaderUC", "Lde3/d;", "isWrongStateErrorUC", "Lae3/n;", "regenerateStatementUC", "Lbe3/i;", "startConfirmationStatusUC", "Lae3/g;", "getCoordinatesUC", "Lbe3/c;", "cancelAwaitConfirmationInitialInfoSideUC", "Lfe3/t0;", "setupData", "<init>", "(Lyy/a;Lpg3/c;Lpg3/b;Lbe3/a;Law0/f0;Lae3/x;Law0/a0;Law0/o;Lae3/r;Lae3/i;Lmx/c;Lib4/c;Log3/a;Law0/d;Lac4/a;Lde3/d;Lae3/n;Lbe3/i;Lae3/g;Lbe3/c;Lfe3/t0;)V", "data", "Loq/i0;", "la", "(Lfe3/t0;)V", "Lfe3/y4;", "destination", "A2", "(Lfe3/y4;)V", "e4", "()V", "A", "B1", "Lyd3/f;", "recoveredNewCollision", "Z1", "(Lyd3/f;)V", "m8", "Lsv0/y;", "processId", "L4", "(Lsv0/y;)V", "h3", "x5", "U4", "b7", "Lxi3/b;", "model", "u1", "(Lxi3/b;)V", "Lse3/a;", "insuranceDetailsData", "s4", "(Lse3/a;)V", "Ldf3/a;", "vehicleDetailsData", "d4", "(Ldf3/a;)V", "Lve3/a;", "personalDetailsData", "O5", "(Lve3/a;)V", "Lye3/b;", "O7", "(Lye3/b;)V", "Lsv0/s0;", "status", "O4", "(Lsv0/y;Lsv0/s0;)V", "Lgf3/a;", "w5", "(Lgf3/a;)V", "Lmu/g;", "Lvy/c;", "m", "()Lmu/g;", "k0", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Y8", "Lkotlin/Function1;", "Ltv0/e;", "update", "e7", "(Ler/l;Ltq/e;)Ljava/lang/Object;", "Ltv0/b;", "f3", "Ltv0/a;", "J6", "Lsv0/l;", "collisionRole", "U3", "(Lsv0/l;Ltq/e;)Ljava/lang/Object;", "Lsv0/o;", "author", "B", "(Lsv0/o;Ltq/e;)Ljava/lang/Object;", ip.a.f96138c, "Ltv0/i;", "description", "D4", "Ltv0/i$a;", "address", "b6", "(Ltv0/i$a;Ltq/e;)Ljava/lang/Object;", "Ltv0/m;", "pages", "J3", "X5", "(Ltq/e;)Ljava/lang/Object;", "Ltv0/k;", "vehicle", "b4", "(Ltv0/k;Ltq/e;)Ljava/lang/Object;", "Ltv0/h;", "damage", "T0", "(Ltv0/h;Ltq/e;)Ljava/lang/Object;", "Ltv0/f;", "personalData", "D3", "", "Ltv0/b$a;", "photos", "w3", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ltv0/l;", "vehicleOwnerDetails", "e8", "(Ltv0/l;Ltq/e;)Ljava/lang/Object;", "details", "j2", "Lsv0/q0;", "fileImageConfiguration", "x1", "(Lsv0/q0;Ltq/e;)Ljava/lang/Object;", "Lo04/c;", "photo", "a3", "(Lo04/c;Ltq/e;)Ljava/lang/Object;", "Lwx/k$a;", "", "originalName", "originalUri", "g8", "(Lwx/k$a;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "y6", "Lfe3/t0$c;", "entry", "R9", "(Lfe3/t0$c;Ltq/e;)Ljava/lang/Object;", "Log3/w$g;", "action", "aa", "(Log3/w$g;Ltq/e;)Ljava/lang/Object;", "Lyd3/f$a;", "ia", "(Lyd3/f$a;Ltq/e;)Ljava/lang/Object;", "ha", "(Lfe3/y4;Ltq/e;)Ljava/lang/Object;", "Lsv0/n;", "confirmationStatus", "Y9", "(Lsv0/n;Ltq/e;)Ljava/lang/Object;", "Lsv0/n$e;", "na", "(Lsv0/n$e;)V", "Log3/w$n;", "oa", "(Log3/w$n;Ltq/e;)Ljava/lang/Object;", "Log3/w$o;", "pa", "(Log3/w$o;Ltq/e;)Ljava/lang/Object;", "Lsv0/g0;", "statementReady", "W9", "(Lsv0/g0;)V", "Ltv0/g;", "savedDraftCollision", "ma", "(Ltv0/g;)V", "Ldx/b;", "domainError", "retryAction", "closeAction", "T9", "(Ldx/b;Log3/w;Log3/w;Ltq/e;)Ljava/lang/Object;", "Log3/w$c$j;", "Q9", "(Log3/w$c$j;)V", "Log3/z$a;", "X9", "(Log3/y;)Log3/z$a;", "b", "Lpg3/c;", "c", "Lpg3/b;", "d", "Lbe3/a;", "e", "Law0/f0;", "f", "Lae3/x;", "g", "Law0/a0;", "h", "Law0/o;", "j", "Lae3/r;", "k", "Lae3/i;", "l", "Lmx/c;", "Lib4/c;", "n", "Log3/a;", "p", "Law0/d;", "q", "Lac4/a;", "r", "Lde3/d;", "s", "Lae3/n;", "t", "Lbe3/i;", "v", "Lae3/g;", "w", "Lbe3/c;", "x", "Lfe3/t0;", "y", "Log3/y;", "initialState", "Lk10/t;", "z", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Log3/w$c;", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "nestedNavAction", "Lmu/p0;", "C", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "Ldx/i;", "()Ldx/i;", "X", "()Ltv0/e;", "currentData", "getDescription", "w1", "()Ltv0/i;", "currentDescription", "o", "()Ltv0/i$a;", "Lth3/a$a;", "M3", "vehicleListData", "O2", "()Lth3/a$a;", "currentVehicleListData", "Lqh3/a$a;", "J5", "vehicleDamageDetailsData", "x6", "()Lqh3/a$a;", "currentVehicleDamageDetailsData", "i", "g6", "()Ltv0/f;", "currentPersonalData", "z5", "R5", "()Ltv0/l;", "currentVehicleOwnerDetails", "G3", "vehiclePhotos", "C1", "()Ljava/util/List;", "currentVehiclePhotos", "Lsv0/e;", "C6", "selectedVehicle", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n0 extends l00.g<State, og3.w> implements og3.z, og3.x, og3.a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final xw.b<og3.w.c> navAction;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final xw.b<og3.w.c.j> nestedNavAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final mu.p0<og3.z.Data> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pg3.c screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pg3.b newCollisionExitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final be3.a awaitConfirmationInitialInfoUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final aw0.f0 startAwaitConfirmationStatementUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ae3.x subscribeDescriptionUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final aw0.a0 monitorConfirmationStatementStatusUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final aw0.o cancelAwaitConfirmationStatementUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ae3.r saveNewCollisionDataUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ae3.i getSavedCollisionDataUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final og3.a dataSourceContract;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final aw0.d beGetReadyToSignStatementDataUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final de3.d isWrongStateErrorUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ae3.n regenerateStatementUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final be3.i startConfirmationStatusUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ae3.g getCoordinatesUC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final be3.c cancelAwaitConfirmationInitialInfoSideUC;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final fe3.t0 setupData;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, og3.w> stateMachine;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f145399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f145400c;

        static {
            int[] iArr = new int[sv0.o.values().length];
            try {
                iArr[sv0.o.ME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sv0.o.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f145398a = iArr;
            int[] iArr2 = new int[tv0.c.values().length];
            try {
                iArr2[tv0.c.VehicleList.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[tv0.c.VehicleOwnership.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[tv0.c.Insurances.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[tv0.c.Damage.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[tv0.c.DamageDetails.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[tv0.c.Photos.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[tv0.c.ContactDetails.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            f145399b = iArr2;
            int[] iArr3 = new int[sv0.s0.values().length];
            try {
                iArr3[sv0.s0.StatementCreated.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[sv0.s0.StatementCreatedNotReported.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[sv0.s0.ReadyToSignRejectedByOther.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[sv0.s0.ReadyToSignConfirmed.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[sv0.s0.StatementCreatingError.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[sv0.s0.Created.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[sv0.s0.InitialInfoRejected.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[sv0.s0.StatementFilledByMe.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[sv0.s0.ReadyToSignRejectedByMe.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[sv0.s0.ReadyToSignConfirmedByMe.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[sv0.s0.InitialInfoConfirmedByMe.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[sv0.s0.Initialized.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[sv0.s0.ReadyToSign.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[sv0.s0.InitialInfoConfirmed.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[sv0.s0.ReportedToUfg.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[sv0.s0.ReportedToUfgFormFilled.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[sv0.s0.ReportedToUfgToFillForm.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[sv0.s0.Unknown.ordinal()] = 18;
            } catch (NoSuchFieldError unused27) {
            }
            f145400c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$m;", "<unused var>", "Log3/y;", "state", "Loq/i0;", "<anonymous>", "(Log3/w$m;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<og3.w.m, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145402f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f145402f;
            uq.b.e();
            if (this.f145401e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            y4 currentDestination = state.getCurrentDestination();
            if (currentDestination != null) {
                n0 n0Var = n0.this;
                n0Var.Q9(new og3.w.c.j.ShowExitDialog(n0Var.newCollisionExitDialogMapper.b(new pg3.b.Params(currentDestination, state.getWorkingCopyValidityDays(), n0Var.b9(og3.w.e.f145704a)))));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.m mVar, State state, tq.e<? super oq.i0> eVar) {
            a0 a0Var = n0.this.new a0(eVar);
            a0Var.f145402f = state;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145404e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ og3.w.c.j f145406g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(og3.w.c.j jVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f145406g = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145404e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c.j> bVarG = n0.this.g();
                og3.w.c.j jVar = this.f145406g;
                this.f145404e = 1;
                if (bVarG.F(jVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new b(this.f145406g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$e;", "<unused var>", "Log3/y;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Log3/w$e;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<og3.w.e, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145407e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145408f;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f145408f;
            Object objE = uq.b.e();
            int i15 = this.f145407e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                y4 currentDestination = state.getCurrentDestination();
                this.f145408f = vq.j.a(state);
                this.f145407e = 1;
                if (n0Var.ha(currentDestination, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            n0.this.B1();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.e eVar, State state, tq.e<? super oq.i0> eVar2) {
            b0 b0Var = n0.this.new b0(eVar2);
            b0Var.f145408f = state;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ BEVehicleDataWithType f145411f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n0 f145412g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145413a;

            static {
                int[] iArr = new int[sv0.m0.values().length];
                try {
                    iArr[sv0.m0.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sv0.m0.OWNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[sv0.m0.CO_OWNER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f145413a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(BEVehicleDataWithType bEVehicleDataWithType, n0 n0Var, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f145411f = bEVehicleDataWithType;
            this.f145412g = n0Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r5.F(r1, r4) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r5.F(r1, r4) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f145410e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 == r3) goto Le
                if (r1 != r2) goto L12
            Le:
                oq.u.b(r5)
                goto L5f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                tv0.k r5 = r4.f145411f
                sv0.e r5 = r5.getVehicleData()
                sv0.m0 r5 = r5.getVehicleCardOwnershipType()
                int[] r1 = og3.n0.c.a.f145413a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 == r3) goto L4e
                if (r5 == r2) goto L3d
                r1 = 3
                if (r5 != r1) goto L37
                goto L3d
            L37:
                oq.p r5 = new oq.p
                r5.<init>()
                throw r5
            L3d:
                og3.n0 r5 = r4.f145412g
                xw.b r5 = r5.g()
                og3.w$c$j$h r1 = og3.w.c.j.h.f145688a
                r4.f145410e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L5f
                goto L5e
            L4e:
                og3.n0 r5 = r4.f145412g
                xw.b r5 = r5.g()
                og3.w$c$j$r r1 = og3.w.c.j.r.f145698a
                r4.f145410e = r3
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L5f
            L5e:
                return r0
            L5f:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: og3.n0.c.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new c(this.f145411f, this.f145412g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$b;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$b;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<og3.w.HandleSetupData, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145414e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145415f;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.HandleSetupData handleSetupData = (og3.w.HandleSetupData) this.f145415f;
            Object objE = uq.b.e();
            int i15 = this.f145414e;
            if (i15 == 0) {
                oq.u.b(obj);
                fe3.t0 entry = handleSetupData.getEntry();
                if (entry instanceof NewStatement) {
                    n0.this.d9(new og3.w.UpdateWorkingCopyValidityDays(((NewStatement) handleSetupData.getEntry()).a()));
                } else if (entry instanceof RecoveredCollision) {
                    n0.this.d9(new og3.w.UpdateWorkingCopyValidityDays(((RecoveredCollision) handleSetupData.getEntry()).getWorkingCopyValidityDays()));
                    n0.this.d9(new og3.w.OnRetrievedRecoveredNewCollision(((RecoveredCollision) handleSetupData.getEntry()).getRecoveredNewCollision()));
                } else if (entry instanceof fe3.t0.c) {
                    n0 n0Var = n0.this;
                    fe3.t0.c cVar = (fe3.t0.c) handleSetupData.getEntry();
                    this.f145415f = vq.j.a(handleSetupData);
                    this.f145414e = 1;
                    if (n0Var.R9(cVar, this) == objE) {
                        return objE;
                    }
                } else if (entry instanceof fe3.t0.b) {
                    n0.this.d9(og3.w.i.f145710a);
                } else {
                    if (!(entry instanceof fe3.t0.a)) {
                        throw new oq.p();
                    }
                    n0 n0Var2 = n0.this;
                    dx.i<dx.b, ProcessId> iVarE = n0Var2.e();
                    n0 n0Var3 = n0.this;
                    if (iVarE instanceof dx.i.Left) {
                        n0Var3.d9(og3.w.d.f145703a);
                        return oq.i0.f148189a;
                    }
                    if (!(iVarE instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    n0Var2.Q9(new og3.w.c.j.GoToSuccess(new bh3.f.FromExpiredTokenError((ProcessId) ((dx.i.Right) iVarE).b())));
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.HandleSetupData handleSetupData, State state, tq.e<? super oq.i0> eVar) {
            c0 c0Var = n0.this.new c0(eVar);
            c0Var.f145415f = handleSetupData;
            return c0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f145418e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145420g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145418e = obj;
            this.f145420g |= PKIFailureInfo.systemUnavail;
            return n0.this.Y9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145421e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f145423g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(ProcessId processId, tq.e<? super d0> eVar) {
            super(1, eVar);
            this.f145423g = processId;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145421e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToAddVehicle goToAddVehicle = new og3.w.c.GoToAddVehicle(this.f145423g);
                this.f145421e = 1;
                if (bVarY1.F(goToAddVehicle, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new d0(this.f145423g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((d0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145426f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f145428h;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145426f = obj;
            this.f145428h |= PKIFailureInfo.systemUnavail;
            return n0.this.aa(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145429e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ProcessId f145431g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ sv0.s0 f145432h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(ProcessId processId, sv0.s0 s0Var, tq.e<? super e0> eVar) {
            super(1, eVar);
            this.f145431g = processId;
            this.f145432h = s0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145429e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToAutomaticReport goToAutomaticReport = new og3.w.c.GoToAutomaticReport(this.f145431g, this.f145432h);
                this.f145429e = 1;
                if (bVarY1.F(goToAutomaticReport, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new e0(this.f145431g, this.f145432h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((e0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f145434e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145436g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145434e = obj;
            this.f145436g |= PKIFailureInfo.systemUnavail;
            return n0.this.ia(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145437e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ DownloadPdfSetupData f145439g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(DownloadPdfSetupData downloadPdfSetupData, tq.e<? super f0> eVar) {
            super(1, eVar);
            this.f145439g = downloadPdfSetupData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145437e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToDownloadPdf goToDownloadPdf = new og3.w.c.GoToDownloadPdf(this.f145439g);
                this.f145437e = 1;
                if (bVarY1.F(goToDownloadPdf, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new f0(this.f145439g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((f0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements mu.g<og3.z.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f145440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f145441b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f145442a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n0 f145443b;

            /* JADX INFO: renamed from: og3.n0$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3609a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f145444d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f145445e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f145446f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f145448h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f145449j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f145450k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f145451l;

                public C3609a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f145444d = obj;
                    this.f145445e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n0 n0Var) {
                this.f145442a = hVar;
                this.f145443b = n0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3609a c3609a;
                if (eVar instanceof C3609a) {
                    c3609a = (C3609a) eVar;
                    int i15 = c3609a.f145445e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3609a.f145445e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3609a = new C3609a(eVar);
                    }
                } else {
                    c3609a = new C3609a(eVar);
                }
                Object obj2 = c3609a.f145444d;
                Object objE = uq.b.e();
                int i16 = c3609a.f145445e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f145442a;
                    og3.z.Data dataX9 = this.f145443b.X9((State) obj);
                    c3609a.f145446f = vq.j.a(obj);
                    c3609a.f145448h = vq.j.a(c3609a);
                    c3609a.f145449j = vq.j.a(obj);
                    c3609a.f145450k = vq.j.a(hVar);
                    c3609a.f145451l = 0;
                    c3609a.f145445e = 1;
                    if (hVar.F(dataX9, c3609a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public g(mu.g gVar, n0 n0Var) {
            this.f145440a = gVar;
            this.f145441b = n0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super og3.z.Data> hVar, tq.e eVar) {
            Object objA = this.f145440a.a(new a(hVar, this.f145441b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145452e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ InsuranceDetailsData f145454g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(InsuranceDetailsData insuranceDetailsData, tq.e<? super g0> eVar) {
            super(1, eVar);
            this.f145454g = insuranceDetailsData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145452e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToInsuranceDetails goToInsuranceDetails = new og3.w.c.GoToInsuranceDetails(this.f145454g);
                this.f145452e = 1;
                if (bVarY1.F(goToInsuranceDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new g0(this.f145454g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((g0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f145458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f145459h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f145460j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f145461k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f145462l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f145463m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f145464n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f145466q;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145464n = obj;
            this.f145466q |= PKIFailureInfo.systemUnavail;
            return n0.this.oa(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145467e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PersonalDetailsData f145469g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(PersonalDetailsData personalDetailsData, tq.e<? super h0> eVar) {
            super(1, eVar);
            this.f145469g = personalDetailsData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145467e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToPersonalDetails goToPersonalDetails = new og3.w.c.GoToPersonalDetails(this.f145469g);
                this.f145467e = 1;
                if (bVarY1.F(goToPersonalDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new h0(this.f145469g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((h0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f145470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f145474h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f145475j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f145477l;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f145475j = obj;
            this.f145477l |= PKIFailureInfo.systemUnavail;
            return n0.this.pa(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145478e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PhotosDetailsSetupData f145480g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(PhotosDetailsSetupData photosDetailsSetupData, tq.e<? super i0> eVar) {
            super(1, eVar);
            this.f145480g = photosDetailsSetupData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145478e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToPhotosDetails goToPhotosDetails = new og3.w.c.GoToPhotosDetails(this.f145480g);
                this.f145478e = 1;
                if (bVarY1.F(goToPhotosDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new i0(this.f145480g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((i0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$g;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$g;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<og3.w.OnRetrievedRecoveredNewCollision, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145482f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.OnRetrievedRecoveredNewCollision onRetrievedRecoveredNewCollision = (og3.w.OnRetrievedRecoveredNewCollision) this.f145482f;
            Object objE = uq.b.e();
            int i15 = this.f145481e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f145482f = vq.j.a(onRetrievedRecoveredNewCollision);
                this.f145481e = 1;
                if (n0Var.aa(onRetrievedRecoveredNewCollision, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.OnRetrievedRecoveredNewCollision onRetrievedRecoveredNewCollision, State state, tq.e<? super oq.i0> eVar) {
            j jVar = n0.this.new j(eVar);
            jVar.f145482f = onRetrievedRecoveredNewCollision;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145484e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ VehicleDetailsData f145486g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(VehicleDetailsData vehicleDetailsData, tq.e<? super j0> eVar) {
            super(1, eVar);
            this.f145486g = vehicleDetailsData;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145484e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToVehicleDetails goToVehicleDetails = new og3.w.c.GoToVehicleDetails(this.f145486g);
                this.f145484e = 1;
                if (bVarY1.F(goToVehicleDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new j0(this.f145486g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((j0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$a;", "<unused var>", "Log3/y;", "state", "Loq/i0;", "<anonymous>", "(Log3/w$a;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<og3.w.a, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145488f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145490a;

            static {
                int[] iArr = new int[sv0.m0.values().length];
                try {
                    iArr[sv0.m0.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sv0.m0.OWNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[sv0.m0.CO_OWNER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f145490a = iArr;
            }
        }

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            BEVehicleData vehicleData;
            State state = (State) this.f145488f;
            Object objE = uq.b.e();
            int i15 = this.f145487e;
            if (i15 == 0) {
                oq.u.b(obj);
                y4 currentDestination = state.getCurrentDestination();
                if (fr.t.c(currentDestination, y4.h.f62060a)) {
                    n0 n0Var = n0.this;
                    og3.w.c.i iVar = og3.w.c.i.f145680a;
                    this.f145488f = vq.j.a(state);
                    this.f145487e = 1;
                    if (n0Var.F(iVar, this) == objE) {
                        return objE;
                    }
                } else if (fr.t.c(currentDestination, y4.v.f62088a)) {
                    n0.this.Q9(og3.w.c.j.q.f145697a);
                } else if (fr.t.c(currentDestination, y4.j.f62064a)) {
                    BEVehicleDataWithType selectedVehicle = n0.this.X().getYourDetails().getSelectedVehicle();
                    sv0.m0 vehicleCardOwnershipType = (selectedVehicle == null || (vehicleData = selectedVehicle.getVehicleData()) == null) ? null : vehicleData.getVehicleCardOwnershipType();
                    int i16 = vehicleCardOwnershipType == null ? -1 : a.f145490a[vehicleCardOwnershipType.ordinal()];
                    if (i16 == -1) {
                        n0.this.Q9(og3.w.c.j.q.f145697a);
                    } else if (i16 != 1) {
                        if (i16 != 2 && i16 != 3) {
                            throw new oq.p();
                        }
                        n0.this.Q9(og3.w.c.j.q.f145697a);
                    } else {
                        n0.this.Q9(og3.w.c.j.r.f145698a);
                    }
                } else if (fr.t.c(currentDestination, y4.s.f62082a)) {
                    n0.this.Q9(og3.w.c.j.h.f145688a);
                } else if (fr.t.c(currentDestination, y4.t.f62084a)) {
                    n0.this.Q9(og3.w.c.j.o.f145695a);
                } else if (fr.t.c(currentDestination, y4.w.f62090a)) {
                    if (n0.this.X().getYourDetails().getSelectedDamage() instanceof tv0.h.Damaged) {
                        n0.this.Q9(og3.w.c.j.p.f145696a);
                    } else {
                        n0.this.Q9(og3.w.c.j.o.f145695a);
                    }
                } else if (fr.t.c(currentDestination, y4.e.f62054a)) {
                    n0.this.Q9(og3.w.c.j.s.f145699a);
                } else if (fr.t.c(currentDestination, y4.a.f62046a) || fr.t.c(currentDestination, y4.f.f62056a) || fr.t.c(currentDestination, y4.q.f62078a) || fr.t.c(currentDestination, y4.r.f62080a) || currentDestination == null) {
                    n0.this.Q9(og3.w.c.j.a.f145681a);
                } else if (!fr.t.c(currentDestination, y4.g.f62058a) && !fr.t.c(currentDestination, y4.l.f62068a) && !fr.t.c(currentDestination, y4.d.f62052a) && !fr.t.c(currentDestination, y4.i.f62062a) && !fr.t.c(currentDestination, y4.k.f62066a) && !fr.t.c(currentDestination, y4.m.f62070a) && !fr.t.c(currentDestination, y4.n.f62072a) && !fr.t.c(currentDestination, y4.u.f62086a) && !fr.t.c(currentDestination, y4.p.f62076a) && !fr.t.c(currentDestination, y4.o.f62074a) && !fr.t.c(currentDestination, y4.b.f62048a)) {
                    throw new oq.p();
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.a aVar, State state, tq.e<? super oq.i0> eVar) {
            k kVar = n0.this.new k(eVar);
            kVar.f145488f = state;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145491e;

        k0(tq.e<? super k0> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145491e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c.j> bVarG = n0.this.g();
                og3.w.c.j.q qVar = og3.w.c.j.q.f145697a;
                this.f145491e = 1;
                if (bVarG.F(qVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new k0(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((k0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Log3/w$d;", "<unused var>", "Log3/y;", "Loq/i0;", "<anonymous>", "(Log3/w$d;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<og3.w.d, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145493e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145493e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0.this.h3();
                n0 n0Var = n0.this;
                og3.w.c.i iVar = og3.w.c.i.f145680a;
                this.f145493e = 1;
                if (n0Var.F(iVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.d dVar, State state, tq.e<? super oq.i0> eVar) {
            return n0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145495e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ xi3.b f145497g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l0(xi3.b bVar, tq.e<? super l0> eVar) {
            super(1, eVar);
            this.f145497g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f145495e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<og3.w.c> bVarY1 = n0.this.Y1();
                og3.w.c.GoToWriteInsurance goToWriteInsurance = new og3.w.c.GoToWriteInsurance(this.f145497g);
                this.f145495e = 1;
                if (bVarY1.F(goToWriteInsurance, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return n0.this.new l0(this.f145497g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((l0) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsv0/n;", "status", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsv0/n;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sv0.n, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145498e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145499f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sv0.n nVar = (sv0.n) this.f145499f;
            Object objE = uq.b.e();
            int i15 = this.f145498e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f145499f = vq.j.a(nVar);
                this.f145498e = 1;
                if (n0Var.Y9(nVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sv0.n nVar, State state, tq.e<? super oq.i0> eVar) {
            m mVar = n0.this.new m(eVar);
            mVar.f145499f = nVar;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$f;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$f;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<og3.w.OnRejectionConfirmation, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145502f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f145504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f145505b;

            static {
                int[] iArr = new int[sv0.o.values().length];
                try {
                    iArr[sv0.o.ME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[sv0.o.OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f145504a = iArr;
                int[] iArr2 = new int[sv0.a0.values().length];
                try {
                    iArr2[sv0.a0.IDENTITY_REJECTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[sv0.a0.DESCRIPTION_REJECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                f145505b = iArr2;
            }
        }

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.OnRejectionConfirmation onRejectionConfirmation = (og3.w.OnRejectionConfirmation) this.f145502f;
            uq.b.e();
            if (this.f145501e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f145505b[onRejectionConfirmation.getRejectedReason().ordinal()];
            if (i15 != 1 && i15 != 2) {
                throw new oq.p();
            }
            n0.this.d9(new og3.w.StartAwaitDescription(onRejectionConfirmation.getProcessId()));
            int i16 = a.f145504a[n0.this.X().getChapterDescription().getAuthor().ordinal()];
            if (i16 == 1) {
                n0.this.Q9(og3.w.c.j.C3618c.f145683a);
            } else {
                if (i16 != 2) {
                    throw new oq.p();
                }
                n0.this.Q9(new og3.w.c.j.GoToDescriptionWaiting(new DescriptionPreparationWaitingModel(onRejectionConfirmation.getProcessId(), n0.this.X().getChapterDescription().getAuthor(), true)));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.OnRejectionConfirmation onRejectionConfirmation, State state, tq.e<? super oq.i0> eVar) {
            n nVar = n0.this.new n(eVar);
            nVar.f145502f = onRejectionConfirmation;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$n;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$n;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<og3.w.n, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145507f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.n nVar = (og3.w.n) this.f145507f;
            Object objE = uq.b.e();
            int i15 = this.f145506e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f145507f = vq.j.a(nVar);
                this.f145506e = 1;
                if (n0Var.oa(nVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.n nVar, State state, tq.e<? super oq.i0> eVar) {
            o oVar = n0.this.new o(eVar);
            oVar.f145507f = nVar;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$o;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$o;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<og3.w.StartAwaitDescription, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145510f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.StartAwaitDescription startAwaitDescription = (og3.w.StartAwaitDescription) this.f145510f;
            Object objE = uq.b.e();
            int i15 = this.f145509e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                this.f145510f = vq.j.a(startAwaitDescription);
                this.f145509e = 1;
                if (n0Var.pa(startAwaitDescription, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.StartAwaitDescription startAwaitDescription, State state, tq.e<? super oq.i0> eVar) {
            p pVar = n0.this.new p(eVar);
            pVar.f145510f = startAwaitDescription;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lsv0/k0;", "statuses", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljava/util/List;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<List<? extends sv0.k0>, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f145514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f145515h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f145516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f145517k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f145518l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f145519m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f145520n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f145521p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f145522q;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004c  */
        /* JADX WARN: Code duplicated, block: B:13:0x0055  */
        /* JADX WARN: Code duplicated, block: B:15:0x0059  */
        /* JADX WARN: Code duplicated, block: B:17:0x00c0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:20:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:22:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:23:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:26:0x00e6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0053 -> B:28:0x00ec). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c1 -> B:19:0x00c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d2 -> B:28:0x00ec). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00dc -> B:28:0x00ec). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:15:0x0059
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r25) {
            /*
                Method dump skipped, instruction units count: 243
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: og3.n0.q.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(List<? extends sv0.k0> list, State state, tq.e<? super oq.i0> eVar) {
            q qVar = n0.this.new q(eVar);
            qVar.f145522q = list;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Log3/w$k;", "<unused var>", "Log3/y;", "Loq/i0;", "<anonymous>", "(Log3/w$k;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<og3.w.k, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145524e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145525f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f145526g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f145527h;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            n0 n0Var;
            Object objE = uq.b.e();
            int i15 = this.f145527h;
            if (i15 == 0) {
                oq.u.b(obj);
                ProcessId processIdA = n0.this.X().d().a();
                if (processIdA != null) {
                    n0 n0Var2 = n0.this;
                    ae3.i iVar = n0Var2.getSavedCollisionDataUC;
                    ae3.i.Params params = new ae3.i.Params(processIdA);
                    this.f145524e = vq.j.a(processIdA);
                    this.f145525f = n0Var2;
                    this.f145526g = 0;
                    this.f145527h = 1;
                    obj = iVar.d(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                    n0Var = n0Var2;
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) this.f145525f;
            oq.u.b(obj);
            n0Var.ma((BESavedDraftCollision) obj);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.k kVar, State state, tq.e<? super oq.i0> eVar) {
            return n0.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$i;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$i;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<og3.w.i, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145530f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f145532e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f145533f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f145534g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f145535h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f145536j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f145537k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ n0 f145538l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ og3.w.i f145539m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0 n0Var, og3.w.i iVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f145538l = n0Var;
                this.f145539m = iVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
            
                if (r3.T9(r5, r4, r6, r7) == r0) goto L23;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: og3.n0.s.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f145538l, this.f145539m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.i iVar = (og3.w.i) this.f145530f;
            Object objE = uq.b.e();
            int i15 = this.f145529e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = n0.this.loaderUC;
                a aVar2 = new a(n0.this, iVar, null);
                this.f145530f = vq.j.a(iVar);
                this.f145529e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.i iVar, State state, tq.e<? super oq.i0> eVar) {
            s sVar = n0.this.new s(eVar);
            sVar.f145530f = iVar;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Log3/w$q;", "action", "Lk10/c0;", "Log3/y;", "state", "Lk10/l;", "<anonymous>", "(Log3/w$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<og3.w.UpdateCurrentDestination, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145542g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(og3.w.UpdateCurrentDestination updateCurrentDestination, State state) {
            return State.b(state, updateCurrentDestination.getDestination(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final og3.w.UpdateCurrentDestination updateCurrentDestination = (og3.w.UpdateCurrentDestination) this.f145541f;
            k10.c0 c0Var = (k10.c0) this.f145542g;
            uq.b.e();
            if (this.f145540e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n0.this.d9(new og3.w.OnUpdatedDestination(((State) c0Var.a()).getCurrentDestination(), updateCurrentDestination.getDestination()));
            return c0Var.b(new er.l() { // from class: og3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.t.O(updateCurrentDestination, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.UpdateCurrentDestination updateCurrentDestination, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            t tVar = n0.this.new t(eVar);
            tVar.f145541f = updateCurrentDestination;
            tVar.f145542g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$p;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$p;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<og3.w.StartConfirmationInitialInfoSide, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145545f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.StartConfirmationInitialInfoSide startConfirmationInitialInfoSide = (og3.w.StartConfirmationInitialInfoSide) this.f145545f;
            Object objE = uq.b.e();
            int i15 = this.f145544e;
            if (i15 == 0) {
                oq.u.b(obj);
                be3.i iVar = n0.this.startConfirmationStatusUC;
                be3.i.Params params = new be3.i.Params(startConfirmationInitialInfoSide.getProcessId());
                this.f145545f = vq.j.a(startConfirmationInitialInfoSide);
                this.f145544e = 1;
                if (iVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.StartConfirmationInitialInfoSide startConfirmationInitialInfoSide, State state, tq.e<? super oq.i0> eVar) {
            u uVar = n0.this.new u(eVar);
            uVar.f145545f = startConfirmationInitialInfoSide;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$l;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$l;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<og3.w.ShowError, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145547e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145548f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.ShowError showError = (og3.w.ShowError) this.f145548f;
            uq.b.e();
            if (this.f145547e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            n0.this.Q9(new og3.w.c.j.ShowErrorInNestedNavContent(showError.getError()));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.ShowError showError, State state, tq.e<? super oq.i0> eVar) {
            v vVar = n0.this.new v(eVar);
            vVar.f145548f = showError;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$h;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$h;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<og3.w.OnUpdatedDestination, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145551f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.OnUpdatedDestination onUpdatedDestination = (og3.w.OnUpdatedDestination) this.f145551f;
            Object objE = uq.b.e();
            int i15 = this.f145550e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                y4 oldDestination = onUpdatedDestination.getOldDestination();
                this.f145551f = vq.j.a(onUpdatedDestination);
                this.f145550e = 1;
                if (n0Var.ha(oldDestination, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.OnUpdatedDestination onUpdatedDestination, State state, tq.e<? super oq.i0> eVar) {
            w wVar = n0.this.new w(eVar);
            wVar.f145551f = onUpdatedDestination;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Log3/w$h;", "action", "Log3/y;", "<unused var>", "Loq/i0;", "<anonymous>", "(Log3/w$h;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<og3.w.OnUpdatedDestination, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145553e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145554f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            og3.w.OnUpdatedDestination onUpdatedDestination = (og3.w.OnUpdatedDestination) this.f145554f;
            Object objE = uq.b.e();
            int i15 = this.f145553e;
            if (i15 == 0) {
                oq.u.b(obj);
                n0 n0Var = n0.this;
                y4 oldDestination = onUpdatedDestination.getOldDestination();
                this.f145554f = vq.j.a(onUpdatedDestination);
                this.f145553e = 1;
                if (n0Var.ha(oldDestination, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.OnUpdatedDestination onUpdatedDestination, State state, tq.e<? super oq.i0> eVar) {
            x xVar = n0.this.new x(eVar);
            xVar.f145554f = onUpdatedDestination;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Log3/w$r;", "action", "Lk10/c0;", "Log3/y;", "state", "Lk10/l;", "<anonymous>", "(Log3/w$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<og3.w.UpdateWorkingCopyValidityDays, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f145556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f145557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f145558g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(og3.w.UpdateWorkingCopyValidityDays updateWorkingCopyValidityDays, State state) {
            return State.b(state, null, updateWorkingCopyValidityDays.getWorkingCopyValidityDays(), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final og3.w.UpdateWorkingCopyValidityDays updateWorkingCopyValidityDays = (og3.w.UpdateWorkingCopyValidityDays) this.f145557f;
            k10.c0 c0Var = (k10.c0) this.f145558g;
            uq.b.e();
            if (this.f145556e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: og3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return n0.y.O(updateWorkingCopyValidityDays, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.UpdateWorkingCopyValidityDays updateWorkingCopyValidityDays, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            y yVar = new y(eVar);
            yVar.f145557f = updateWorkingCopyValidityDays;
            yVar.f145558g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Log3/w$j;", "<unused var>", "Log3/y;", "Loq/i0;", "<anonymous>", "(Log3/w$j;Log3/y;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<og3.w.j, State, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f145559e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f145560f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f145561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f145562h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f145563j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f145564k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f145565l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f145566m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f145567n;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x008d  */
        /* JADX WARN: Code duplicated, block: B:21:0x00bb  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
        
            if (r8.T9(r10, r11, r12, r19) == r1) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: og3.n0.z.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(og3.w.j jVar, State state, tq.e<? super oq.i0> eVar) {
            return n0.this.new z(eVar).J(oq.i0.f148189a);
        }
    }

    public n0(yy.a aVar, pg3.c cVar, pg3.b bVar, be3.a aVar2, aw0.f0 f0Var, ae3.x xVar, aw0.a0 a0Var, aw0.o oVar, ae3.r rVar, ae3.i iVar, mx.c cVar2, ib4.c cVar3, og3.a aVar3, aw0.d dVar, ac4.a aVar4, de3.d dVar2, ae3.n nVar, be3.i iVar2, ae3.g gVar, be3.c cVar4, fe3.t0 t0Var) {
        this.screenMapper = cVar;
        this.newCollisionExitDialogMapper = bVar;
        this.awaitConfirmationInitialInfoUC = aVar2;
        this.startAwaitConfirmationStatementUC = f0Var;
        this.subscribeDescriptionUC = xVar;
        this.monitorConfirmationStatementStatusUC = a0Var;
        this.cancelAwaitConfirmationStatementUC = oVar;
        this.saveNewCollisionDataUC = rVar;
        this.getSavedCollisionDataUC = iVar;
        this.labelProvider = cVar2;
        this.domainErrorMapper = cVar3;
        this.dataSourceContract = aVar3;
        this.beGetReadyToSignStatementDataUC = dVar;
        this.loaderUC = aVar4;
        this.isWrongStateErrorUC = dVar2;
        this.regenerateStatementUC = nVar;
        this.startConfirmationStatusUC = iVar2;
        this.getCoordinatesUC = gVar;
        this.cancelAwaitConfirmationInitialInfoSideUC = cVar4;
        this.setupData = t0Var;
        State state = new State(null, null, 3, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: og3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.qa(this.f145355a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.state = a9(new g(e9().getState(), this), X9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q9(og3.w.c.j jVar) {
        i00.a.a(this, new b(jVar, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object R9(final fe3.t0.c cVar, tq.e<? super oq.i0> eVar) {
        Object objF3 = f3(new er.l() { // from class: og3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.S9(cVar, (YourDetails) obj);
            }
        }, eVar);
        return objF3 == uq.b.e() ? objF3 : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YourDetails S9(fe3.t0.c cVar, YourDetails yourDetails) {
        BEVehicleData vehicleData;
        List<Insurance> listE;
        List listI1;
        if (cVar instanceof fe3.t0.c.FromAddVehicle) {
            fe3.t0.c.FromAddVehicle fromAddVehicle = (fe3.t0.c.FromAddVehicle) cVar;
            return yourDetails.c().contains(fromAddVehicle.getVehicle()) ? yourDetails : YourDetails.b(yourDetails, null, null, null, null, pq.v.M0(yourDetails.c(), fromAddVehicle.getVehicle()), null, null, null, 239, null);
        }
        if (!(cVar instanceof fe3.t0.c.FromAddInsurance)) {
            if (!(cVar instanceof fe3.t0.c.FromRemoveInsurance)) {
                throw new oq.p();
            }
            BEVehicleDataWithType selectedVehicle = yourDetails.getSelectedVehicle();
            return YourDetails.b(yourDetails, selectedVehicle != null ? BEVehicleDataWithType.b(selectedVehicle, BEVehicleData.b(selectedVehicle.getVehicleData(), null, null, null, null, null, null, null, pq.v.I0(selectedVehicle.getVehicleData().e(), ((fe3.t0.c.FromRemoveInsurance) cVar).getInsurance()), false, null, 895, null), null, 2, null) : null, null, null, null, null, null, null, null, 254, null);
        }
        BEVehicleDataWithType selectedVehicle2 = yourDetails.getSelectedVehicle();
        if (selectedVehicle2 != null && (vehicleData = selectedVehicle2.getVehicleData()) != null && (listE = vehicleData.e()) != null && (listI1 = pq.v.i1(listE)) != null) {
            fe3.t0.c.FromAddInsurance fromAddInsurance = (fe3.t0.c.FromAddInsurance) cVar;
            Insurance oldInsurance = fromAddInsurance.getOldInsurance();
            if (oldInsurance != null) {
                listI1.remove(oldInsurance);
            }
            listI1.add(fromAddInsurance.getNewInsurance());
            BEVehicleDataWithType selectedVehicle3 = yourDetails.getSelectedVehicle();
            YourDetails yourDetailsB = YourDetails.b(yourDetails, selectedVehicle3 != null ? BEVehicleDataWithType.b(selectedVehicle3, BEVehicleData.b(selectedVehicle3.getVehicleData(), null, null, null, null, null, null, null, listI1, false, null, 895, null), null, 2, null) : null, null, null, null, null, null, null, null, 254, null);
            if (yourDetailsB != null) {
                return yourDetailsB;
            }
        }
        return yourDetails;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object T9(final dx.b bVar, final og3.w wVar, final og3.w wVar2, tq.e<? super oq.i0> eVar) {
        Object objF = F(new og3.w.c.ShowError(this.domainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: og3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.V9(this.f145371a, bVar, wVar, wVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    static /* synthetic */ Object U9(n0 n0Var, dx.b bVar, og3.w wVar, og3.w wVar2, tq.e eVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            wVar = null;
        }
        if ((i15 & 4) != 0) {
            wVar2 = null;
        }
        return n0Var.T9(bVar, wVar, wVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(n0 n0Var, dx.b bVar, og3.w wVar, og3.w wVar2, ib4.c.b bVar2) {
        if (n0Var.isWrongStateErrorUC.c(new de3.d.Params(bVar)).booleanValue()) {
            n0Var.d9(og3.w.d.f145703a);
        } else if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar2 instanceof ib4.c.b.a.Primary)) {
            if (wVar != null) {
                n0Var.d9(wVar);
            }
        } else {
            if (!fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close)) {
                throw new oq.p();
            }
            if (wVar2 != null) {
                n0Var.d9(wVar2);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W9(StatementReady statementReady) {
        switch (a.f145400c[statementReady.getStatus().ordinal()]) {
            case 1:
            case 2:
                h3();
                dx.i<dx.b, ProcessId> iVarE = e();
                if (iVarE instanceof dx.i.Left) {
                    d9(og3.w.d.f145703a);
                    return;
                } else {
                    if (!(iVarE instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    Q9(new og3.w.c.j.GoToSuccess(new bh3.f.FromStatus((ProcessId) ((dx.i.Right) iVarE).b(), statementReady)));
                    return;
                }
            case 3:
                h3();
                d9(og3.w.k.f145712a);
                return;
            case 4:
                ProcessId processIdA = e().a();
                if (processIdA != null) {
                    Q9(new og3.w.c.j.GoToPreparationStatementWaiting(processIdA));
                    return;
                }
                return;
            case 5:
                d9(new og3.w.ShowError(new jb4.b.Failure(this.labelProvider.c(md3.b.f125843v), null, null, new ErrorActionData(this.labelProvider.c(md3.b.f125684b0), b9(og3.w.j.f145711a)), new ErrorActionData(this.labelProvider.c(md3.b.f125731h), b9(og3.w.d.f145703a)), null, null, 102, null)));
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return;
            default:
                throw new oq.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final og3.z.Data X9(State state) {
        return this.screenMapper.b(new pg3.c.Params(state, b9(og3.w.a.f145669a), b9(og3.w.m.f145714a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (e7(r7, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (T9(r2, r4, r7, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y9(final sv0.n r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof og3.n0.d
            if (r0 == 0) goto L13
            r0 = r7
            og3.n0$d r0 = (og3.n0.d) r0
            int r1 = r0.f145420g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145420g = r1
            goto L18
        L13:
            og3.n0$d r0 = new og3.n0$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f145418e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f145420g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f145417d
            sv0.n r6 = (sv0.n) r6
            oq.u.b(r7)
            goto L86
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f145417d
            sv0.n r6 = (sv0.n) r6
            oq.u.b(r7)
            goto L5b
        L40:
            oq.u.b(r7)
            boolean r7 = r6 instanceof sv0.n.ConfirmedByAll
            if (r7 == 0) goto L61
            og3.f0 r7 = new og3.f0
            r7.<init>()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f145417d = r6
            r0.f145420g = r4
            java.lang.Object r6 = r5.e7(r7, r0)
            if (r6 != r1) goto L5b
            goto L85
        L5b:
            og3.w$c$j$q r6 = og3.w.c.j.q.f145697a
            r5.Q9(r6)
            goto Lb3
        L61:
            boolean r7 = r6 instanceof sv0.n.Error
            if (r7 == 0) goto L89
            r7 = r6
            sv0.n$c r7 = (sv0.n.Error) r7
            dx.b r2 = r7.getError()
            og3.w$p r4 = new og3.w$p
            sv0.y r7 = r7.getProcessId()
            r4.<init>(r7)
            og3.w$d r7 = og3.w.d.f145703a
            java.lang.Object r6 = vq.j.a(r6)
            r0.f145417d = r6
            r0.f145420g = r3
            java.lang.Object r6 = r5.T9(r2, r4, r7, r0)
            if (r6 != r1) goto L86
        L85:
            return r1
        L86:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L89:
            boolean r7 = r6 instanceof sv0.n.RejectedByOtherSide
            if (r7 == 0) goto L93
            sv0.n$e r6 = (sv0.n.RejectedByOtherSide) r6
            r5.na(r6)
            goto Lb3
        L93:
            boolean r7 = r6 instanceof sv0.n.ConfirmedByMe
            if (r7 == 0) goto L9d
            og3.w$c$j$g r6 = og3.w.c.j.g.f145687a
            r5.Q9(r6)
            goto Lb3
        L9d:
            boolean r7 = r6 instanceof sv0.n.RejectedByMe
            if (r7 == 0) goto Lb6
            og3.w$f r7 = new og3.w$f
            sv0.n$d r6 = (sv0.n.RejectedByMe) r6
            sv0.y r0 = r6.getProcessId()
            sv0.a0 r6 = r6.getRejectedReason()
            r7.<init>(r0, r6)
            r5.d9(r7)
        Lb3:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        Lb6:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.n0.Y9(sv0.n, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData Z9(sv0.n nVar, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, new dx.i.Right(((sv0.n.ConfirmedByAll) nVar).getProcessId()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x018b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x018d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:79:0x0209  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0210  */
    /* JADX WARN: Code duplicated, block: B:81:0x0217  */
    /* JADX WARN: Code duplicated, block: B:82:0x021e  */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02fd, code lost:
    
        if (e7(r2, r0) == r1) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026e, code lost:
    
        if (e7(r2, r0) == r1) goto L114;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aa(og3.w.OnRetrievedRecoveredNewCollision r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.n0.aa(og3.w$g, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData ba(yd3.f fVar, BENewCollisionData bENewCollisionData) {
        return ((yd3.f.InitialInfoConfirmed) fVar).getSavedDraftCollision().getNewCollisionData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData ca(yd3.f fVar, BENewCollisionData bENewCollisionData) {
        return ((yd3.f.StatementFilledByMe) fVar).getSavedDraftCollision().getNewCollisionData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData da(yd3.f fVar, BENewCollisionData bENewCollisionData) {
        return ((yd3.f.ReadyToSignConfirmedByMe) fVar).getSavedDraftCollision().getNewCollisionData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData ea(yd3.f fVar, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, new dx.i.Right(((yd3.f.ReadyToSignConfirmed) fVar).getProcessId()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData fa(yd3.f fVar, BENewCollisionData bENewCollisionData) {
        return ((yd3.f.ReadyToSign) fVar).getSavedDraftCollision().getNewCollisionData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData ga(yd3.f fVar, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, new dx.i.Right(((yd3.f.ReadyToSignRejectedByOther) fVar).getProcessId()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ha(y4 y4Var, tq.e<? super oq.i0> eVar) {
        tv0.c cVar;
        Object objD;
        y4.u uVar = y4.u.f62086a;
        if (fr.t.c(y4Var, uVar)) {
            cVar = tv0.c.VehicleList;
        } else if (fr.t.c(y4Var, y4.v.f62088a)) {
            cVar = tv0.c.VehicleOwnership;
        } else if (fr.t.c(y4Var, y4.j.f62064a)) {
            cVar = tv0.c.Insurances;
        } else if (fr.t.c(y4Var, y4.s.f62082a)) {
            cVar = tv0.c.Damage;
        } else if (fr.t.c(y4Var, y4.t.f62084a)) {
            cVar = tv0.c.DamageDetails;
        } else if (fr.t.c(y4Var, y4.w.f62090a)) {
            cVar = tv0.c.Photos;
        } else {
            cVar = fr.t.c(y4Var, y4.e.f62054a) ? tv0.c.ContactDetails : null;
        }
        return ((fr.t.c(y4Var, y4.b.f62048a) || fr.t.c(y4Var, uVar) || fr.t.c(y4Var, y4.v.f62088a) || fr.t.c(y4Var, y4.j.f62064a) || fr.t.c(y4Var, y4.s.f62082a) || fr.t.c(y4Var, y4.t.f62084a) || fr.t.c(y4Var, y4.w.f62090a) || fr.t.c(y4Var, y4.e.f62054a)) && (objD = this.saveNewCollisionDataUC.d(new ae3.r.Params(cVar, X()), eVar)) == uq.b.e()) ? objD : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (J6(r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ia(final yd3.f.a r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof og3.n0.f
            if (r0 == 0) goto L13
            r0 = r7
            og3.n0$f r0 = (og3.n0.f) r0
            int r1 = r0.f145436g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145436g = r1
            goto L18
        L13:
            og3.n0$f r0 = new og3.n0$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f145434e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f145436g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f145433d
            yd3.f$a r6 = (yd3.f.a) r6
            oq.u.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f145433d
            yd3.f$a r6 = (yd3.f.a) r6
            oq.u.b(r7)
            goto L53
        L40:
            oq.u.b(r7)
            og3.b0 r7 = new og3.b0
            r7.<init>()
            r0.f145433d = r6
            r0.f145436g = r4
            java.lang.Object r7 = r5.e7(r7, r0)
            if (r7 != r1) goto L53
            goto L66
        L53:
            og3.c0 r7 = new og3.c0
            r7.<init>()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f145433d = r6
            r0.f145436g = r3
            java.lang.Object r6 = r5.J6(r7, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.n0.ia(yd3.f$a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BENewCollisionData ja(yd3.f.a aVar, BENewCollisionData bENewCollisionData) {
        return BENewCollisionData.b(bENewCollisionData, new dx.i.Right(aVar.getProcessId()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Description ka(yd3.f.a aVar, Description description) {
        return Description.b(description, null, aVar.getAuthor(), aVar.getDescription(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ma(BESavedDraftCollision savedDraftCollision) {
        Q9(new og3.w.c.j.ShowErrorInNestedNavContent(new jb4.b.Warning(this.labelProvider.c(md3.b.f125686b2), this.labelProvider.c(md3.b.f125678a2), null, new ErrorActionData(this.labelProvider.c(md3.b.f125731h), b9(new og3.w.OnRetrievedRecoveredNewCollision(new yd3.f.InitialInfoConfirmed(savedDraftCollision)))), null, null, new ErrorActionData(null, b9(new og3.w.OnRetrievedRecoveredNewCollision(new yd3.f.InitialInfoConfirmed(savedDraftCollision))), 1, null), 52, null)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    private final void na(sv0.n.RejectedByOtherSide confirmationStatus) {
        Label labelC;
        er.a<oq.i0> aVarB9 = b9(new og3.w.OnRejectionConfirmation(confirmationStatus.getProcessId(), confirmationStatus.getRejectedReason()));
        Label labelC2 = this.labelProvider.c(ie3.a.d(confirmationStatus.getRejectedReason()));
        Integer numC = ie3.a.c(confirmationStatus.getRejectedReason());
        if (numC != null) {
            labelC = this.labelProvider.c(numC.intValue());
            if (labelC == null) {
                labelC = Label.INSTANCE.c();
            }
        } else {
            labelC = Label.INSTANCE.c();
        }
        Q9(new og3.w.c.j.ShowErrorInNestedNavContent(new jb4.b.Warning(labelC2, labelC, null, new ErrorActionData(this.labelProvider.c(md3.b.f125731h), aVarB9), null, null, new ErrorActionData(null, aVarB9, 1, null), 52, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e0, code lost:
    
        if (T9(r8, r13, r9, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object oa(og3.w.n r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.n0.oa(og3.w$n, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (T9(r2, r7, r4, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pa(og3.w.StartAwaitDescription r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof og3.n0.i
            if (r0 == 0) goto L13
            r0 = r8
            og3.n0$i r0 = (og3.n0.i) r0
            int r1 = r0.f145477l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f145477l = r1
            goto L18
        L13:
            og3.n0$i r0 = new og3.n0$i
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f145475j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f145477l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f145472f
            dx.b r7 = (dx.b) r7
            java.lang.Object r7 = r0.f145471e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f145470d
            og3.w$o r7 = (og3.w.StartAwaitDescription) r7
            oq.u.b(r8)
            goto La3
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f145470d
            og3.w$o r7 = (og3.w.StartAwaitDescription) r7
            oq.u.b(r8)
            goto L61
        L48:
            oq.u.b(r8)
            ae3.x r8 = r6.subscribeDescriptionUC
            ae3.x$a r2 = new ae3.x$a
            sv0.y r5 = r7.getProcessId()
            r2.<init>(r5)
            r0.f145470d = r7
            r0.f145477l = r4
            java.lang.Object r8 = r8.f(r2, r0)
            if (r8 != r1) goto L61
            goto La2
        L61:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Right
            if (r2 == 0) goto L78
            r2 = r8
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            yd3.a r2 = (yd3.a) r2
            og3.w$c$j$l r4 = new og3.w$c$j$l
            r4.<init>(r2)
            r6.Q9(r4)
        L78:
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto La3
            r2 = r8
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b r2 = (dx.b) r2
            og3.w$d r4 = og3.w.d.f145703a
            java.lang.Object r5 = vq.j.a(r7)
            r0.f145470d = r5
            r0.f145471e = r8
            java.lang.Object r8 = vq.j.a(r2)
            r0.f145472f = r8
            r8 = 0
            r0.f145473g = r8
            r0.f145474h = r8
            r0.f145477l = r3
            java.lang.Object r7 = r6.T9(r2, r7, r4, r0)
            if (r7 != r1) goto La3
        La2:
            return r1
        La3:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: og3.n0.pa(og3.w$o, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 qa(final n0 n0Var, k10.v vVar) {
        vVar.c(fr.q0.c(State.class), new er.l() { // from class: og3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return n0.ra(this.f145350a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ra(n0 n0Var, k10.z zVar) {
        t tVar = n0Var.new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(og3.w.UpdateCurrentDestination.class), oVar, tVar);
        zVar.x(fr.q0.c(og3.w.ShowError.class), oVar, n0Var.new v(null));
        zVar.x(fr.q0.c(og3.w.OnUpdatedDestination.class), oVar, n0Var.new w(null));
        zVar.x(fr.q0.c(og3.w.OnUpdatedDestination.class), oVar, n0Var.new x(null));
        zVar.v(fr.q0.c(og3.w.UpdateWorkingCopyValidityDays.class), oVar, new y(null));
        zVar.x(fr.q0.c(og3.w.j.class), oVar, n0Var.new z(null));
        zVar.x(fr.q0.c(og3.w.m.class), oVar, n0Var.new a0(null));
        zVar.x(fr.q0.c(og3.w.e.class), oVar, n0Var.new b0(null));
        zVar.x(fr.q0.c(og3.w.HandleSetupData.class), oVar, n0Var.new c0(null));
        zVar.x(fr.q0.c(og3.w.OnRetrievedRecoveredNewCollision.class), oVar, n0Var.new j(null));
        zVar.x(fr.q0.c(og3.w.a.class), oVar, n0Var.new k(null));
        zVar.x(fr.q0.c(og3.w.d.class), oVar, n0Var.new l(null));
        be3.a aVar = n0Var.awaitConfirmationInitialInfoUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        k10.k.s(zVar, (mu.g) aVar.a(c1792a), null, n0Var.new m(null), 2, null);
        zVar.x(fr.q0.c(og3.w.OnRejectionConfirmation.class), oVar, n0Var.new n(null));
        zVar.x(fr.q0.c(og3.w.n.class), oVar, n0Var.new o(null));
        zVar.x(fr.q0.c(og3.w.StartAwaitDescription.class), oVar, n0Var.new p(null));
        k10.k.s(zVar, (mu.g) n0Var.monitorConfirmationStatementStatusUC.a(c1792a), null, n0Var.new q(null), 2, null);
        zVar.x(fr.q0.c(og3.w.k.class), oVar, n0Var.new r(null));
        zVar.x(fr.q0.c(og3.w.i.class), oVar, n0Var.new s(null));
        zVar.x(fr.q0.c(og3.w.StartConfirmationInitialInfoSide.class), oVar, n0Var.new u(null));
        return oq.i0.f148189a;
    }

    @Override // og3.x
    public void A() {
        d9(og3.w.a.f145669a);
    }

    @Override // og3.x
    public void A2(y4 destination) {
        d9(new og3.w.UpdateCurrentDestination(destination));
    }

    @Override // cg3.a, hh3.a, kh3.a
    public Object B(sv0.o oVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.B(oVar, eVar);
    }

    @Override // og3.x
    public void B1() {
        d9(og3.w.d.f145703a);
    }

    @Override // hh3.a, kh3.a
    public sv0.o C() {
        return this.dataSourceContract.C();
    }

    @Override // bi3.a
    public List<YourDetails.Photo> C1() {
        return this.dataSourceContract.C1();
    }

    @Override // lg3.a
    public mu.g<BEVehicleData> C6() {
        return this.dataSourceContract.C6();
    }

    @Override // hh3.a, tf3.c, kh3.a
    public Object D(ProcessId processId, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.D(processId, eVar);
    }

    @Override // wf3.a
    public Object D3(er.l<? super BEPersonalData, BEPersonalData> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.D3(lVar, eVar);
    }

    @Override // pf3.a
    public Object D4(er.l<? super BEVehicleCollisionDescriptionConception, BEVehicleCollisionDescriptionConception> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.D4(lVar, eVar);
    }

    @Override // bi3.a
    public mu.g<List<YourDetails.Photo>> G3() {
        return this.dataSourceContract.G3();
    }

    @Override // th3.a
    public Object J3(er.l<? super BEVehiclesPages, BEVehiclesPages> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.J3(lVar, eVar);
    }

    @Override // qh3.a
    public mu.g<qh3.a.Data> J5() {
        return this.dataSourceContract.J5();
    }

    @Override // og3.a
    public Object J6(er.l<? super Description, Description> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.J6(lVar, eVar);
    }

    @Override // og3.x
    public void L4(ProcessId processId) {
        d9(new og3.w.StartAwaitDescription(processId));
    }

    @Override // hh3.a, kh3.a
    public sv0.l M() {
        return this.dataSourceContract.M();
    }

    @Override // th3.a
    public mu.g<th3.a.Data> M3() {
        return this.dataSourceContract.M3();
    }

    @Override // th3.a
    public th3.a.Data O2() {
        return this.dataSourceContract.O2();
    }

    @Override // og3.x
    public void O4(ProcessId processId, sv0.s0 status) {
        i00.a.a(this, new e0(processId, status, null));
    }

    @Override // og3.x
    public void O5(PersonalDetailsData personalDetailsData) {
        i00.a.a(this, new h0(personalDetailsData, null));
    }

    @Override // og3.x
    public void O7(PhotosDetailsSetupData data) {
        i00.a.a(this, new i0(data, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: P9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(og3.w.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // xh3.a
    public tv0.l R5() {
        return this.dataSourceContract.R5();
    }

    @Override // nh3.a, qh3.a
    public Object T0(tv0.h hVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.T0(hVar, eVar);
    }

    @Override // if3.a
    public Object U3(sv0.l lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.U3(lVar, eVar);
    }

    @Override // og3.x
    public void U4() {
        ProcessId processIdA = X().d().a();
        if (processIdA != null) {
            i00.a.a(this, new d0(processIdA, null));
        }
    }

    @Override // og3.a, wf3.a
    public BENewCollisionData X() {
        return this.dataSourceContract.X();
    }

    @Override // th3.a
    public Object X5(tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.X5(eVar);
    }

    @Override // zx.b
    public xw.b<og3.w.c> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.cancelAwaitConfirmationInitialInfoSideUC.a(gz.b.a.C1792a.f78542a);
        super.Y8();
    }

    @Override // og3.x
    public void Z1(yd3.f recoveredNewCollision) {
        d9(new og3.w.OnRetrievedRecoveredNewCollision(recoveredNewCollision));
    }

    @Override // bi3.a
    public Object a3(o04.c cVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.a3(cVar, eVar);
    }

    @Override // th3.a
    public Object b4(BEVehicleDataWithType bEVehicleDataWithType, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.b4(bEVehicleDataWithType, eVar);
    }

    @Override // lf3.c
    public Object b6(BEVehicleCollisionDescriptionConception.LocationDetails locationDetails, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.b6(locationDetails, eVar);
    }

    @Override // og3.x
    public void b7() {
        BEVehicleDataWithType selectedVehicle = X().getYourDetails().getSelectedVehicle();
        if (selectedVehicle != null) {
            i00.a.a(this, new c(selectedVehicle, this, null));
        }
    }

    @Override // og3.x
    public void d4(VehicleDetailsData vehicleDetailsData) {
        i00.a.a(this, new j0(vehicleDetailsData, null));
    }

    @Override // og3.a, pf3.a, wf3.a, bi3.a, kh3.a
    public dx.i<dx.b, ProcessId> e() {
        return this.dataSourceContract.e();
    }

    @Override // og3.x
    public void e4() {
        d9(og3.w.m.f145714a);
    }

    @Override // og3.a
    public Object e7(er.l<? super BENewCollisionData, BENewCollisionData> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.e7(lVar, eVar);
    }

    @Override // xh3.a
    public Object e8(tv0.l lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.e8(lVar, eVar);
    }

    @Override // l00.g
    protected k10.t<State, og3.w> e9() {
        return this.stateMachine;
    }

    @Override // og3.a
    public Object f3(er.l<? super YourDetails, YourDetails> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.f3(lVar, eVar);
    }

    @Override // og3.x
    public xw.b<og3.w.c.j> g() {
        return this.nestedNavAction;
    }

    @Override // wf3.a
    public BEPersonalData g6() {
        return this.dataSourceContract.g6();
    }

    @Override // bi3.a
    public Object g8(wx.k.Image image, String str, String str2, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.g8(image, str, str2, eVar);
    }

    @Override // pf3.a
    public mu.g<BEVehicleCollisionDescriptionConception> getDescription() {
        return this.dataSourceContract.getDescription();
    }

    @Override // l00.e
    public mu.p0<og3.z.Data> getState() {
        return this.state;
    }

    @Override // og3.x
    public void h3() {
        this.cancelAwaitConfirmationStatementUC.a(gz.b.a.C1792a.f78542a);
    }

    @Override // wf3.a
    public mu.g<BEPersonalData> i() {
        return this.dataSourceContract.i();
    }

    @Override // xh3.a
    public Object j2(er.l<? super tv0.l, ? extends tv0.l> lVar, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.j2(lVar, eVar);
    }

    @Override // tf3.a, vg3.a
    public Object k0(ProcessId processId, tq.e<? super oq.i0> eVar) {
        d9(new og3.w.StartConfirmationInitialInfoSide(processId));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: la, reason: merged with bridge method [inline-methods] */
    public void P5(fe3.t0 data) {
        d9(new og3.w.HandleSetupData(data));
    }

    @Override // lf3.b
    public mu.g<Coordinates> m() {
        return this.getCoordinatesUC.b(gz.b.a.C1792a.f78542a);
    }

    @Override // og3.x
    public void m8() {
        d9(og3.w.n.f145715a);
    }

    @Override // lf3.c
    public BEVehicleCollisionDescriptionConception.LocationDetails o() {
        return this.dataSourceContract.o();
    }

    @Override // og3.x
    public void s4(InsuranceDetailsData insuranceDetailsData) {
        i00.a.a(this, new g0(insuranceDetailsData, null));
    }

    @Override // og3.x
    public void u1(xi3.b model) {
        i00.a.a(this, new l0(model, null));
    }

    @Override // pf3.a
    public BEVehicleCollisionDescriptionConception w1() {
        return this.dataSourceContract.w1();
    }

    @Override // wf3.a
    public Object w3(List<YourDetails.Photo> list, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.w3(list, eVar);
    }

    @Override // og3.x
    public void w5(DownloadPdfSetupData data) {
        i00.a.a(this, new f0(data, null));
    }

    @Override // bi3.a
    public Object x1(Uploader uploader, tq.e<? super oq.i0> eVar) {
        return this.dataSourceContract.x1(uploader, eVar);
    }

    @Override // og3.x
    public void x5() {
        i00.a.a(this, new k0(null));
    }

    @Override // qh3.a
    public qh3.a.Data x6() {
        return this.dataSourceContract.x6();
    }

    @Override // bi3.a
    public Object y6(o04.c cVar, tq.e<? super YourDetails.Photo> eVar) {
        return this.dataSourceContract.y6(cVar, eVar);
    }

    @Override // xh3.a
    public mu.g<tv0.l> z5() {
        return this.dataSourceContract.z5();
    }
}
