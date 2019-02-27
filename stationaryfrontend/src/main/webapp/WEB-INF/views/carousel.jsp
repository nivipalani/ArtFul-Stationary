


<!-- <body -->
<!-- 	style="margin: 0; padding: 0; font-family: -apple-system, BlinkMacSystemFont, Helvetica, Arial, 'Segoe UI', sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol'; background-color: #262626;"> -->

	<!-- #region Jssor Slider Begin -->
	<!-- Generator: Jssor Slider Maker -->
	<!-- Source: https://www.jssor.com -->
	<script
		src="https://jssors8.azureedge.net/script/jssor.slider-27.5.0.min.js"
		type="text/javascript"></script>
	<script type="text/javascript">
		jssor_1_slider_init = function() {

			var jssor_1_SlideshowTransitions = [
					{
						$Duration : 800,
						x : 0.25,
						$Zoom : 1.5,
						$Easing : {
							$Left : $Jease$.$InWave,
							$Zoom : $Jease$.$InCubic
						},
						$Opacity : 2,
						$ZIndex : -10,
						$Brother : {
							$Duration : 800,
							x : -0.25,
							$Zoom : 1.5,
							$Easing : {
								$Left : $Jease$.$InWave,
								$Zoom : $Jease$.$InCubic
							},
							$Opacity : 2,
							$ZIndex : -10
						}
					},
					{
						$Duration : 1200,
						x : 0.5,
						$Cols : 2,
						$ChessMode : {
							$Column : 3
						},
						$Easing : {
							$Left : $Jease$.$InOutCubic
						},
						$Opacity : 2,
						$Brother : {
							$Duration : 1200,
							$Opacity : 2
						}
					},
					{
						$Duration : 1000,
						x : 1,
						$Rows : 2,
						$ChessMode : {
							$Row : 3
						},
						$Easing : {
							$Left : $Jease$.$InOutQuart,
							$Opacity : $Jease$.$Linear
						},
						$Opacity : 2,
						$Brother : {
							$Duration : 1000,
							x : -1,
							$Rows : 2,
							$ChessMode : {
								$Row : 3
							},
							$Easing : {
								$Left : $Jease$.$InOutQuart,
								$Opacity : $Jease$.$Linear
							},
							$Opacity : 2
						}
					},
					{
						$Duration : 800,
						x : 0.2,
						$Delay : 40,
						$Cols : 12,
						$During : {
							$Left : [ 0.4, 0.6 ]
						},
						$SlideOut : true,
						$Formation : $JssorSlideshowFormations$.$FormationStraight,
						$Easing : {
							$Left : $Jease$.$InOutExpo,
							$Opacity : $Jease$.$InOutQuad
						},
						$Opacity : 2,
						$Outside : true,
						$Round : {
							$Top : 0.5
						},
						$Brother : {
							$Duration : 800,
							x : 0.2,
							$Delay : 40,
							$Cols : 12,
							$Formation : $JssorSlideshowFormations$.$FormationStraight,
							$Assembly : 1028,
							$Easing : {
								$Left : $Jease$.$InOutExpo,
								$Opacity : $Jease$.$InOutQuad
							},
							$Opacity : 2,
							$Round : {
								$Top : 0.5
							},
							$Shift : -200
						}
					},
					{
						$Duration : 400,
						$Delay : 50,
						$Rows : 7,
						$Clip : 4,
						$Formation : $JssorSlideshowFormations$.$FormationStraight
					},
					{
						$Duration : 600,
						x : -1,
						y : 1,
						$Delay : 50,
						$Cols : 10,
						$Rows : 5,
						$Opacity : 2,
						$Formation : $JssorSlideshowFormations$.$FormationZigZag,
						$Assembly : 260,
						$ChessMode : {
							$Row : 3
						},
						$Easing : {
							$Top : $Jease$.$InQuart,
							$Opacity : $Jease$.$Linear
						}
					},
					{
						$Duration : 1500,
						x : 0.3,
						y : -0.3,
						$Delay : 20,
						$Cols : 10,
						$Rows : 5,
						$Opacity : 2,
						$Clip : 15,
						$During : {
							$Left : [ 0.1, 0.9 ],
							$Top : [ 0.1, 0.9 ]
						},
						$SlideOut : true,
						$Formation : $JssorSlideshowFormations$.$FormationStraightStairs,
						$Assembly : 260,
						$Easing : {
							$Left : $Jease$.$InJump,
							$Top : $Jease$.$InJump,
							$Clip : $Jease$.$OutQuad
						},
						$Round : {
							$Left : 0.8,
							$Top : 2.5
						}
					},
					{
						$Duration : 1200,
						x : -1,
						y : -1,
						$Cols : 6,
						$Rows : 6,
						$Opacity : 2,
						$Clip : 15,
						$During : {
							$Left : [ 0.2, 0.8 ],
							$Top : [ 0.2, 0.8 ],
							$Clip : [ 0, 0.2 ]
						},
						$Formation : $JssorSlideshowFormations$.$FormationStraight,
						$ChessMode : {
							$Column : 15,
							$Row : 15
						},
						$Easing : {
							$Left : $Jease$.$InCubic,
							$Top : $Jease$.$InCubic,
							$Clip : $Jease$.$Swing
						},
						$ScaleClip : 0.5
					} ];

			var jssor_1_SlideoTransitions = [ [ {
				b : 0,
				d : 600,
				y : -290,
				e : {
					y : 27
				}
			} ], [ {
				b : 0,
				d : 1000,
				y : 185
			}, {
				b : 1000,
				d : 500,
				o : -1
			}, {
				b : 1500,
				d : 500,
				o : 1
			}, {
				b : 2000,
				d : 1500,
				r : 360
			}, {
				b : 3500,
				d : 1000,
				rX : 30
			}, {
				b : 4500,
				d : 500,
				rX : -30
			}, {
				b : 5000,
				d : 1000,
				rY : 30
			}, {
				b : 6000,
				d : 500,
				rY : -30
			}, {
				b : 6500,
				d : 500,
				sX : 1
			}, {
				b : 7000,
				d : 500,
				sX : -1
			}, {
				b : 7500,
				d : 500,
				sY : 1
			}, {
				b : 8000,
				d : 500,
				sY : -1
			}, {
				b : 8500,
				d : 500,
				kX : 30
			}, {
				b : 9000,
				d : 500,
				kX : -30
			}, {
				b : 9500,
				d : 500,
				kY : 30
			}, {
				b : 10000,
				d : 500,
				kY : -30
			}, {
				b : 10500,
				d : 500,
				c : {
					x : 125.00,
					t : -125.00
				}
			}, {
				b : 11000,
				d : 500,
				c : {
					x : -125.00,
					t : 125.00
				}
			} ], [ {
				b : 0,
				d : 600,
				x : 535,
				e : {
					x : 27
				}
			} ], [ {
				b : -1,
				d : 1,
				o : -1
			}, {
				b : 0,
				d : 600,
				o : 1,
				e : {
					o : 5
				}
			} ], [ {
				b : -1,
				d : 1,
				c : {
					x : 250.0,
					t : -250.0
				}
			}, {
				b : 0,
				d : 800,
				c : {
					x : -250.0,
					t : 250.0
				},
				e : {
					c : {
						x : 7,
						t : 7
					}
				}
			} ], [ {
				b : -1,
				d : 1,
				o : -1
			}, {
				b : 0,
				d : 600,
				x : -570,
				o : 1,
				e : {
					x : 6
				}
			} ], [ {
				b : -1,
				d : 1,
				o : -1,
				r : -180
			}, {
				b : 0,
				d : 800,
				o : 1,
				r : 180,
				e : {
					r : 7
				}
			} ], [ {
				b : 0,
				d : 1000,
				y : 80,
				e : {
					y : 24
				}
			}, {
				b : 1000,
				d : 1100,
				x : 570,
				y : 170,
				o : -1,
				r : 30,
				sX : 9,
				sY : 9,
				e : {
					x : 2,
					y : 6,
					r : 1,
					sX : 5,
					sY : 5
				}
			} ], [ {
				b : 2000,
				d : 600,
				rY : 30
			} ], [ {
				b : 0,
				d : 500,
				x : -105
			}, {
				b : 500,
				d : 500,
				x : 230
			}, {
				b : 1000,
				d : 500,
				y : -120
			}, {
				b : 1500,
				d : 500,
				x : -70,
				y : 120
			}, {
				b : 2600,
				d : 500,
				y : -80
			}, {
				b : 3100,
				d : 900,
				y : 160,
				e : {
					y : 24
				}
			} ], [ {
				b : 0,
				d : 1000,
				o : -0.4,
				rX : 2,
				rY : 1
			}, {
				b : 1000,
				d : 1000,
				rY : 1
			}, {
				b : 2000,
				d : 1000,
				rX : -1
			}, {
				b : 3000,
				d : 1000,
				rY : -1
			}, {
				b : 4000,
				d : 1000,
				o : 0.4,
				rX : -1,
				rY : -1
			} ] ];

			var jssor_1_options = {
				$AutoPlay : 1,
				$Idle : 2000,
				$SlideshowOptions : {
					$Class : $JssorSlideshowRunner$,
					$Transitions : jssor_1_SlideshowTransitions
				},
				$CaptionSliderOptions : {
					$Class : $JssorCaptionSlideo$,
					$Transitions : jssor_1_SlideoTransitions,
					$Breaks : [ [ {
						d : 2000,
						b : 1000
					} ] ]
				},
				$ArrowNavigatorOptions : {
					$Class : $JssorArrowNavigator$
				},
				$BulletNavigatorOptions : {
					$Class : $JssorBulletNavigator$
				}
			};

			var jssor_1_slider = new $JssorSlider$("jssor_1", jssor_1_options);

			/*#region responsive code begin*/

			var MAX_WIDTH = 1280;

			function ScaleSlider() {
				var containerElement = jssor_1_slider.$Elmt.parentNode;
				var containerWidth = containerElement.clientWidth;

				if (containerWidth) {

					var expectedWidth = Math.min(MAX_WIDTH || containerWidth,
							containerWidth);

					jssor_1_slider.$ScaleWidth(expectedWidth);
				} else {
					window.setTimeout(ScaleSlider, 30);
				}
			}

			ScaleSlider();

			$Jssor$.$AddEvent(window, "load", ScaleSlider);
			$Jssor$.$AddEvent(window, "resize", ScaleSlider);
			$Jssor$.$AddEvent(window, "orientationchange", ScaleSlider);
			/*#endregion responsive code end*/
		};
	</script>
	<style>
/*jssor slider loading skin spin css*/
.jssorl-009-spin img {
	animation-name: jssorl-009-spin;
	animation-duration: 1.6s;
	animation-iteration-count: infinite;
	animation-timing-function: linear;
}

@
keyframes jssorl-009-spin {from { transform:rotate(0deg);
	
}

to {
	transform: rotate(360deg);
}

}

/*jssor slider bullet skin 052 css*/
.jssorb052 .i {
	position: absolute;
	cursor: pointer;
}

.jssorb052 .i .b {
	fill: #000;
	fill-opacity: 0.3;
}

.jssorb052 .i:hover .b {
	fill-opacity: .7;
}

.jssorb052 .iav .b {
	fill-opacity: 1;
}

.jssorb052 .i.idn {
	opacity: .3;
}

/*jssor slider arrow skin 053 css*/
.jssora053 {
	display: block;
	position: absolute;
	cursor: pointer;
}

.jssora053 .a {
	fill: none;
	stroke: #fff;
	stroke-width: 640;
	stroke-miterlimit: 10;
}

.jssora053:hover {
	opacity: .8;
}

.jssora053.jssora053dn {
	opacity: .5;
}

.jssora053.jssora053ds {
	opacity: .3;
	pointer-events: none;
}
</style>
	<div id="jssor_1"
		style="position: relative; margin: 0 auto; top: 10px; left: 0px; width: 1280px; height: 380px; overflow: hidden; visibility: hidden;">
		<!-- Loading Screen -->
		<div data-u="loading" class="jssorl-009-spin"
			style="position: absolute; top: 0px; left: 0px; width: 100%; height: 100%; text-align: center; background-color: rgba(0, 0, 0, 0.7);">
			<img
				style="margin-top: -19px; position: relative; top: 50%; width: 38px; height: 38px;"
				src="resources/images/stationary.jpg" />
		</div>
		<div data-u="slides"
			style="cursor: default; position: relative; top: 0px; left: 0px; width: 1280px; height: 380px; overflow: hidden;">

			<div>
				<img data-u="image" src="resources/images/file.jpg" />
				<div data-ts="flat" data-p="1360"
					style="position: absolute; top: 0px; left: 0px; width: 980px; height: 380px;">
					<div data-t="2"
						style="position: absolute; top: 30px; left: -505px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">Artful
						Stationary</div>
				</div>
			</div>
			<div>
				<img data-u="image" src="resources/images/img2.jpg" />
				<div data-t="4"
					style="position: absolute; top: 30px; left: 30px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">You
					are the creator at your own destiny</div>
			</div>
			<div>
				<img data-u="image" src="resources/images/pencil.jpg" />
				<div data-t="0"
					style="position: absolute; top: 320px; left: 30px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">Office
					and School items</div>
			</div>
			<div>
				<img data-u="image" src="resources/images/img1.jpg" />
				<div data-ts="flat" data-p="1360"
					style="position: absolute; top: 0px; left: 0px; width: 980px; height: 380px; overflow: hidden;">
					<div data-t="1"
						style="position: absolute; top: -50px; left: 125px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">Your
						needs at your door step</div>
				</div>
			</div>
			<div>
				<img data-u="image" src="resources/images/file1.jpg" />
				<div data-t="3"
					style="position: absolute; top: 30px; left: 30px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">Back
					to School</div>
			</div>

			<div>
				<img data-u="image" src="resources/images/stat2.jpg" />
				<div data-t="6"
					style="position: absolute; top: 30px; left: 30px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">Stationary
					Appliances</div>
			</div>
			<div data-b="0">
				<img data-u="image" src="resources/images/pen.jpg" />
				<div data-t="7"
					style="position: absolute; top: -50px; left: 30px; width: 500px; height: 40px; font-family: Oswald, sans-serif; font-size: 32px; font-weight: 200; line-height: 1.2; text-align: center; background-color: rgba(255, 188, 5, 0.8);">Education
					for the Nation</div>
			</div>
			<div>
				<img data-u="image" src="resources/images/colourpencil.jpg" />
				<!--                 <div data-ts="flat" data-p="1360" style="position:absolute;top:0px;left:0px;width:980px;height:380px;overflow:hidden;"> -->
				<!--                     <div data-t="8" data-ts="preserve-3d" style="position:absolute;top:25px;left:150px;width:250px;height:250px;overflow:hidden;background-color:rgba(40,177,255,0.6);"> -->
				<!--                         <div data-t="9" style="position:absolute;top:100px;left:25px;width:200px;height:50px;font-family:Oswald,sans-serif;font-size:24px;font-weight:200;line-height:2.08;"></div> -->
				<!--                     </div> -->
				<!--                 </div> -->
			</div>
			<div>
				<img data-u="image" src="resources/images/stat3.jpg" />
				<div data-ts="flat" data-p="1360"
					style="position: absolute; top: 0px; left: 0px; width: 980px; height: 380px; overflow: hidden;">
					<div data-t="10"
						style="position: absolute; top: 25px; left: 100px; width: 300px; height: 260px; font-family: Oswald, sans-serif; font-size: 24px; font-weight: 200; line-height: 1.25; padding: 15px 15px 15px 15px; box-sizing: border-box; background-color: rgba(40, 177, 255, 0.6); background-clip: padding-box;">
						All stationary products at one store<br />​<br /> <img
							src="resources/images/stat4.png" />
					</div>
				</div>
			</div>
		</div>
		<!-- Bullet Navigator -->
		<div data-u="navigator" class="jssorb052"
			style="position: absolute; bottom: 12px; right: 12px;"
			data-autocenter="1" data-scale="0.5" data-scale-bottom="0.75">
			<div data-u="prototype" class="i" style="width: 16px; height: 16px;">
				<svg viewbox="0 0 16000 16000"
					style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;">
                    <circle class="b" cx="8000" cy="8000" r="5800"></circle>
                </svg>
			</div>
		</div>
		<!-- Arrow Navigator -->
		<div data-u="arrowleft" class="jssora053"
			style="width: 55px; height: 55px; top: 0px; left: 25px;"
			data-autocenter="2" data-scale="0.75" data-scale-left="0.75">
			<svg viewbox="0 0 16000 16000"
				style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;">
                <polyline class="a"
					points="11040,1920 4960,8000 11040,14080 "></polyline>
            </svg>
		</div>
		<div data-u="arrowright" class="jssora053"
			style="width: 55px; height: 55px; top: 0px; right: 25px;"
			data-autocenter="2" data-scale="0.75" data-scale-right="0.75">
			<svg viewbox="0 0 16000 16000"
				style="position: absolute; top: 0; left: 0; width: 100%; height: 100%;">
                <polyline class="a"
					points="4960,1920 11040,8000 4960,14080 "></polyline>
            </svg>
		</div>
	</div>
	<script type="text/javascript">
		jssor_1_slider_init();
	</script>
	<!-- #endregion Jssor Slider End -->
</body>
