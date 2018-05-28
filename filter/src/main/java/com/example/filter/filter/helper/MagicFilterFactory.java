package com.example.filter.filter.helper;

import com.example.filter.filter.advanced.MagicAmaroFilter;
import com.example.filter.filter.advanced.MagicAntiqueFilter;
import com.example.filter.filter.advanced.MagicBlackCatFilter;
import com.example.filter.filter.advanced.MagicBrannanFilter;
import com.example.filter.filter.advanced.MagicBrooklynFilter;
import com.example.filter.filter.advanced.MagicCalmFilter;
import com.example.filter.filter.advanced.MagicCoolFilter;
import com.example.filter.filter.advanced.MagicCrayonFilter;
import com.example.filter.filter.advanced.MagicEarlyBirdFilter;
import com.example.filter.filter.advanced.MagicEmeraldFilter;
import com.example.filter.filter.advanced.MagicEvergreenFilter;
import com.example.filter.filter.advanced.MagicFairytaleFilter;
import com.example.filter.filter.advanced.MagicFreudFilter;
import com.example.filter.filter.advanced.MagicHealthyFilter;
import com.example.filter.filter.advanced.MagicHefeFilter;
import com.example.filter.filter.advanced.MagicHudsonFilter;
import com.example.filter.filter.advanced.MagicImageAdjustFilter;
import com.example.filter.filter.advanced.MagicInkwellFilter;
import com.example.filter.filter.advanced.MagicKevinFilter;
import com.example.filter.filter.advanced.MagicLatteFilter;
import com.example.filter.filter.advanced.MagicLomoFilter;
import com.example.filter.filter.advanced.MagicN1977Filter;
import com.example.filter.filter.advanced.MagicNashvilleFilter;
import com.example.filter.filter.advanced.MagicNostalgiaFilter;
import com.example.filter.filter.advanced.MagicPixarFilter;
import com.example.filter.filter.advanced.MagicRiseFilter;
import com.example.filter.filter.advanced.MagicRomanceFilter;
import com.example.filter.filter.advanced.MagicSakuraFilter;
import com.example.filter.filter.advanced.MagicSierraFilter;
import com.example.filter.filter.advanced.MagicSketchFilter;
import com.example.filter.filter.advanced.MagicSkinWhitenFilter;
import com.example.filter.filter.advanced.MagicSunriseFilter;
import com.example.filter.filter.advanced.MagicSunsetFilter;
import com.example.filter.filter.advanced.MagicSutroFilter;
import com.example.filter.filter.advanced.MagicSweetsFilter;
import com.example.filter.filter.advanced.MagicTenderFilter;
import com.example.filter.filter.advanced.MagicToasterFilter;
import com.example.filter.filter.advanced.MagicValenciaFilter;
import com.example.filter.filter.advanced.MagicWaldenFilter;
import com.example.filter.filter.advanced.MagicWarmFilter;
import com.example.filter.filter.advanced.MagicWhiteCatFilter;
import com.example.filter.filter.advanced.MagicXproIIFilter;
import com.example.filter.filter.base.gpuimage.GPUImageBrightnessFilter;
import com.example.filter.filter.base.gpuimage.GPUImageContrastFilter;
import com.example.filter.filter.base.gpuimage.GPUImageExposureFilter;
import com.example.filter.filter.base.gpuimage.GPUImageFilter;
import com.example.filter.filter.base.gpuimage.GPUImageHueFilter;
import com.example.filter.filter.base.gpuimage.GPUImageSaturationFilter;
import com.example.filter.filter.base.gpuimage.GPUImageSharpenFilter;

public class MagicFilterFactory{
	
	private static MagicFilterType filterType = MagicFilterType.NONE;
	
	public static GPUImageFilter initFilters(MagicFilterType type){
		filterType = type;
		switch (type) {
		case WHITECAT:
			return new MagicWhiteCatFilter();
		case BLACKCAT:
			return new MagicBlackCatFilter();
		case SKINWHITEN:
			return new MagicSkinWhitenFilter();
		case ROMANCE:
			return new MagicRomanceFilter();
		case SAKURA:
			return new MagicSakuraFilter();
		case AMARO:
			return new MagicAmaroFilter();
		case WALDEN:
			return new MagicWaldenFilter();
		case ANTIQUE:
			return new MagicAntiqueFilter();
		case CALM:
			return new MagicCalmFilter();
		case BRANNAN:
			return new MagicBrannanFilter();
		case BROOKLYN:
			return new MagicBrooklynFilter();
		case EARLYBIRD:
			return new MagicEarlyBirdFilter();
		case FREUD:
			return new MagicFreudFilter();
		case HEFE:
			return new MagicHefeFilter();
		case HUDSON:
			return new MagicHudsonFilter();
		case INKWELL:
			return new MagicInkwellFilter();
		case KEVIN:
			return new MagicKevinFilter();
		case LOMO:
			return new MagicLomoFilter();
		case N1977:
			return new MagicN1977Filter();
		case NASHVILLE:
			return new MagicNashvilleFilter();
		case PIXAR:
			return new MagicPixarFilter();
		case RISE:
			return new MagicRiseFilter();
		case SIERRA:
			return new MagicSierraFilter();
		case SUTRO:
			return new MagicSutroFilter();
		case TOASTER2:
			return new MagicToasterFilter();
		case VALENCIA:
			return new MagicValenciaFilter();
		case XPROII:
			return new MagicXproIIFilter();
		case EVERGREEN:
			return new MagicEvergreenFilter();
		case HEALTHY:
			return new MagicHealthyFilter();
		case COOL:
			return new MagicCoolFilter();
		case EMERALD:
			return new MagicEmeraldFilter();
		case LATTE:
			return new MagicLatteFilter();
		case WARM:
			return new MagicWarmFilter();
		case TENDER:
			return new MagicTenderFilter();
		case SWEETS:
			return new MagicSweetsFilter();
		case NOSTALGIA:
			return new MagicNostalgiaFilter();
		case FAIRYTALE:
			return new MagicFairytaleFilter();
		case SUNRISE:
			return new MagicSunriseFilter();
		case SUNSET:
			return new MagicSunsetFilter();
		case CRAYON:
			return new MagicCrayonFilter();
		case SKETCH:
			return new MagicSketchFilter();
		//image adjust
		case BRIGHTNESS:
			return new GPUImageBrightnessFilter();
		case CONTRAST:
			return new GPUImageContrastFilter();
		case EXPOSURE:
			return new GPUImageExposureFilter();
		case HUE:
			return new GPUImageHueFilter();
		case SATURATION:
			return new GPUImageSaturationFilter();
		case SHARPEN:
			return new GPUImageSharpenFilter();
		case IMAGE_ADJUST:
			return new MagicImageAdjustFilter();
		default:
			return null;
		}
	}
	
	public MagicFilterType getCurrentFilterType(){
		return filterType;
	}
}
